package com.jin.test3;

import com.jin.protocode.StudentRequest;
import com.jin.protocode.StudentResponse;
import com.jin.protocode.StudentResponseList;
import com.jin.protocode.StudentSerivceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.function.Consumer;

/**
 * stream request and no-stream response
 */
public class GRPCClient3 {

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8890)
                .usePlaintext().build();

//        StudentSerivceGrpc.StudentSerivceBlockingStub blockingStub = StudentSerivceGrpc.newBlockingStub(managedChannel);

        StudentSerivceGrpc.StudentSerivceStub stub = StudentSerivceGrpc.newStub(managedChannel);


        StreamObserver<StudentRequest> streamObserver = stub.getStudentAgeStream(new StreamObserver<StudentResponseList>() {
            @Override
            public void onNext(StudentResponseList value) {
                System.out.println("get server data = ");
                value.getStudentResponseList().forEach(new Consumer<StudentResponse>() {
                    @Override
                    public void accept(StudentResponse studentResponse) {
                        System.out.println("data name = " + studentResponse.getName());
                        System.out.println("data age = " + studentResponse.getAge());
                        System.out.println("data city = " + studentResponse.getCity());
                    }
                });
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("finish response");
            }
        });

        for (int i = 0; i < 10; i++) {
            streamObserver.onNext(StudentRequest.newBuilder().setAge(i).build());
        }
        System.out.println("finish request.");
        streamObserver.onCompleted();

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
