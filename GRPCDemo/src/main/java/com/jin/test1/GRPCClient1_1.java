package com.jin.test1;

import com.jin.protocode.MyRequest;
import com.jin.protocode.MyResponse;
import com.jin.protocode.StudentSerivceGrpc;
import com.jin.test4.HeaderClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GRPCClient1_1 {

    public static void main(String[] args) {

        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 8899)
                .idleTimeout(5, TimeUnit.SECONDS) //heat beat
                .keepAliveTimeout(5, TimeUnit.SECONDS)
                .usePlaintext()
                .intercept(new HeaderClientInterceptor())
                .build();

        StudentSerivceGrpc.StudentSerivceBlockingStub blockingStub = StudentSerivceGrpc
//                .newStub()
                .newBlockingStub(managedChannel)

                .withCompression("gzip");//ExperimentalApi

        Scanner scanner = new Scanner(System.in);
        String inputData = "";
        System.out.println("Start input something:");
        while (!"stop".equals(inputData)) {
            inputData = scanner.nextLine();

            long requestTime = System.currentTimeMillis();

            MyResponse myResponse = blockingStub.getRealName(MyRequest.newBuilder().setUsername(inputData).build());

            System.out.println("time duration = " + (System.currentTimeMillis() - requestTime));

            System.out.println("server response message = " + myResponse.getRealname());
        }
    }
}
