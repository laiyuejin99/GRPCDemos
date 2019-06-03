package com.jin.test1;

import com.jin.protocode.MyRequest;
import com.jin.protocode.MyResponse;
import com.jin.protocode.StudentSerivceGrpc;
import com.jin.test4.HeaderClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * rxjava wrap1
 */
public class GRPCClient1_2 {

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8899)
                .idleTimeout(5, TimeUnit.SECONDS) //heat beat
                .keepAliveTime(5, TimeUnit.SECONDS)
                .usePlaintext()
                .intercept(new HeaderClientInterceptor())
                .build();

        StudentSerivceGrpc.StudentSerivceBlockingStub blockingStub = StudentSerivceGrpc
                .newBlockingStub(managedChannel)
                .withCompression("gzip");//ExperimentalApi


        Observable.create(new ObservableOnSubscribe<MyResponse>() {

            @Override
            public void subscribe(ObservableEmitter<MyResponse> observableEmitter) throws Exception {
                Scanner scanner = new Scanner(System.in);
                System.out.println("start input something: ");
                String inputData = "";

                while (!"stop".equals(inputData)) {
                    inputData = scanner.nextLine();
                    //GRPC call
                    MyResponse myResponse = blockingStub.getRealName(MyRequest.newBuilder().setUsername(inputData).build());
                    observableEmitter.onNext(myResponse);
                }
            }
        }).subscribe(new Consumer<MyResponse>() {
            @Override
            public void accept(MyResponse myResponse) throws Exception {
                System.out.println("server response message = " + myResponse.getRealname());
            }
        });


    }


}
