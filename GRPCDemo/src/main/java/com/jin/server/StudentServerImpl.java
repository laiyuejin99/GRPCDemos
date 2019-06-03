package com.jin.server;

import com.jin.protocode.*;
import io.grpc.stub.StreamObserver;
import javafx.scene.chart.ValueAxis;

import java.util.UUID;

public class StudentServerImpl extends StudentSerivceGrpc.StudentSerivceImplBase {

    @Override
    public void getRealName(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("getRealNameByUsername():recepit client message = " + request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname("server response:" + request.getUsername() + " name is Dara").build());
        responseObserver.onCompleted();

    }

    @Override
    public void getStudentByAge(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println("getStudentByAge(): " + request.getAge());

        responseObserver.onNext(StudentResponse.newBuilder()
                .setName("andy1")
                .setAge(20)
                .setCity("san francisco")
                .build());

        responseObserver.onNext(StudentResponse.newBuilder()
                .setName("andy2")
                .setAge(21)
                .setCity("san jose")
                .build());

        responseObserver.onNext(StudentResponse.newBuilder()
                .setName("andy3")
                .setAge(22)
                .setCity("beijing")
                .build());

        responseObserver.onNext(StudentResponse.newBuilder()
                .setName("andy4")
                .setAge(23)
                .setCity("xiamen")
                .build());

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StudentRequest> getStudentAgeStream(StreamObserver<StudentResponseList> responseObserver) {
        return new StreamObserver<StudentRequest>() {
            @Override
            public void onNext(StudentRequest value) {
                System.out.println("get Client Message = " + value.getAge());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                StudentResponse response1 = StudentResponse.newBuilder().setName("Andy1").setAge(22).setCity("beijing").build();
                StudentResponse response2 = StudentResponse.newBuilder().setName("Andy2").setAge(23).setCity("xiamen").build();
                StudentResponse response3 = StudentResponse.newBuilder().setName("Andy3").setAge(24).setCity("san fan").build();

                StudentResponseList responseList = StudentResponseList.newBuilder()
                        .addStudentResponse(response1)
                        .addStudentResponse(response2)
                        .addStudentResponse(response3)
                        .build();
                responseObserver.onNext(responseList);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<StreamRequest> streamToStreamTalk(StreamObserver<StreamResponse> responseObserver) {

        return new StreamObserver<StreamRequest>() {
            @Override
            public void onNext(StreamRequest value) {
                System.out.println("receive client data:" + value.getRequestInfo());
                System.out.println();



                responseObserver.onNext(StreamResponse
                        .newBuilder()
                        .setResponseInfo("receive data from client:" + value.getRequestInfo())
                        .setUUID("Response UUID = " + UUID.randomUUID())
                        .setReceiveTime(value.getRequestTime())
                        .build());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("finish the connection!!!");
                responseObserver.onCompleted();
            }
        };
    }
}
