package com.jin.test1;

import com.jin.protocode.MyRequest;
import com.jin.protocode.MyResponse;
import com.jin.protocode.StudentSerivceGrpc;
import com.jin.test4.HeaderClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.reactivex.*;
import io.reactivex.functions.BiConsumer;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GRPCClient1_3 {
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



        Single.create(new SingleOnSubscribe<MyResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyResponse> singleEmitter) throws Exception {
                Scanner scanner = new Scanner(System.in);
                System.out.println("start input something: ");
                String inputData = scanner.nextLine();
                //GRPC call
                MyResponse myResponse = blockingStub.getRealName(MyRequest.newBuilder().setUsername(inputData).build());
                singleEmitter.onSuccess(myResponse);
                scanner.close();
            }
        }).subscribe(new BiConsumer<MyResponse, Throwable>() {
            @Override
            public void accept(MyResponse myResponse, Throwable throwable) throws Exception {
                System.out.println("server response message = " + myResponse.getRealname());
            }
        });
    }
}
