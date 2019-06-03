package com.jin.test4;

import com.jin.protocode.StreamRequest;
import com.jin.protocode.StreamResponse;
import com.jin.protocode.StudentSerivceGrpc;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.reactivex.subjects.PublishSubject;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GRPCClient4_2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("client start " + System.currentTimeMillis());
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 8899).intercept()
                .idleTimeout(5, TimeUnit.SECONDS) //heat beat ?
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

        PublishSubject<StreamResponse> rxResponse =  PublishSubject.create();

        StudentSerivceGrpc.StudentSerivceStub studentSerivceStub = StudentSerivceGrpc.newStub(managedChannel).withWaitForReady();

        StreamObserver<StreamRequest> streamObserver = studentSerivceStub.streamToStreamTalk(new StreamObserver<StreamResponse>() {
            @Override
            public void onNext(StreamResponse value) {
                rxResponse.onNext(value);//use rx
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

        rxResponse.subscribe(streamResponse -> {
            System.out.println("server response data: " + streamResponse.getResponseInfo());
            System.out.println("duration time " + (System.currentTimeMillis() - streamResponse.getReceiveTime()));
            System.out.println("Mesage UUID " + streamResponse.getUUID());
            System.out.println();
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
