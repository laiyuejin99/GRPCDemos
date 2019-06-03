package com.jin.test2;

import com.jin.protocode.StudentRequest;
import com.jin.protocode.StudentResponse;
import com.jin.protocode.StudentSerivceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

/**
 * request and stream response
 */
public class GRPCClient2 {

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8899)
                .usePlaintext().build();

        StudentSerivceGrpc.StudentSerivceBlockingStub blockingStub = StudentSerivceGrpc.newBlockingStub(managedChannel);

        Iterator<StudentResponse> interResponse = blockingStub.getStudentByAge(StudentRequest.newBuilder().setAge(20).build());

        interResponse.forEachRemaining(studentResponse -> {
            System.out.println("response data name = " + studentResponse.getName());
            System.out.println("response data age = " + studentResponse.getAge());
            System.out.println("response data city = " + studentResponse.getCity());
        });
    }
}
