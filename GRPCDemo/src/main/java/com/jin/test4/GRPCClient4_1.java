package com.jin.test4;

import com.jin.protocode.StreamRequest;
import com.jin.protocode.StreamResponse;
import com.jin.protocode.StudentSerivceGrpc;
import io.grpc.*;
import io.grpc.stub.StreamObserver;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * stream request and stream response
 */
public class GRPCClient4_1 {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("client start " + System.currentTimeMillis());
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 8890).intercept()
                .idleTimeout(5, TimeUnit.SECONDS)
                .intercept(new HeaderClientInterceptor())
                .keepAliveTimeout(5, TimeUnit.SECONDS)
                .usePlaintext()
                .build();

        managedChannel.notifyWhenStateChanged(ConnectivityState.CONNECTING, new Runnable() {
            @Override
            public void run() {
                System.out.println("channel is connecting!!!");

            }
        });

//        new ChannelStatusChecker(managedChannel).start();//check status

        StudentSerivceGrpc.StudentSerivceStub studentSerivceStub = StudentSerivceGrpc.newStub(managedChannel).withWaitForReady();

        StreamObserver<StreamRequest> streamObserver = studentSerivceStub.streamToStreamTalk(new StreamObserver<StreamResponse>() {
            @Override
            public void onNext(StreamResponse value) {
                System.out.println("server response data: " + value.getResponseInfo());
                System.out.println("duration time " + (System.currentTimeMillis() - value.getReceiveTime()));
                System.out.println("Mesage UUID " + value.getUUID());
                System.out.println();
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("finish channel");
            }
        });

        //input data and request
        Scanner scan = new Scanner(System.in);
        System.out.println("start input something:");

        String inputData = "";
        while (!"stop".equals(inputData)) {
            inputData = scan.nextLine();
            streamObserver.onNext(StreamRequest.newBuilder()
                    .setRequestInfo("client data = " + inputData)
                    .setRequestTime(System.currentTimeMillis())
                    .build());

        }

        System.out.println("client finsih: " + System.currentTimeMillis());
        streamObserver.onCompleted();


        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
