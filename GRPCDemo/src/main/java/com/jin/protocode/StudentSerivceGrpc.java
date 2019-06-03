package com.jin.protocode;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: Student.proto")
public final class StudentSerivceGrpc {

  private StudentSerivceGrpc() {}

  public static final String SERVICE_NAME = "com.jin.proto.StudentSerivce";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jin.protocode.MyRequest,
      com.jin.protocode.MyResponse> getGetRealNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRealName",
      requestType = com.jin.protocode.MyRequest.class,
      responseType = com.jin.protocode.MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jin.protocode.MyRequest,
      com.jin.protocode.MyResponse> getGetRealNameMethod() {
    io.grpc.MethodDescriptor<com.jin.protocode.MyRequest, com.jin.protocode.MyResponse> getGetRealNameMethod;
    if ((getGetRealNameMethod = StudentSerivceGrpc.getGetRealNameMethod) == null) {
      synchronized (StudentSerivceGrpc.class) {
        if ((getGetRealNameMethod = StudentSerivceGrpc.getGetRealNameMethod) == null) {
          StudentSerivceGrpc.getGetRealNameMethod = getGetRealNameMethod = 
              io.grpc.MethodDescriptor.<com.jin.protocode.MyRequest, com.jin.protocode.MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.jin.proto.StudentSerivce", "GetRealName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jin.protocode.MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jin.protocode.MyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentSerivceMethodDescriptorSupplier("GetRealName"))
                  .build();
          }
        }
     }
     return getGetRealNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jin.protocode.StudentRequest,
      com.jin.protocode.StudentResponse> getGetStudentByAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentByAge",
      requestType = com.jin.protocode.StudentRequest.class,
      responseType = com.jin.protocode.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jin.protocode.StudentRequest,
      com.jin.protocode.StudentResponse> getGetStudentByAgeMethod() {
    io.grpc.MethodDescriptor<com.jin.protocode.StudentRequest, com.jin.protocode.StudentResponse> getGetStudentByAgeMethod;
    if ((getGetStudentByAgeMethod = StudentSerivceGrpc.getGetStudentByAgeMethod) == null) {
      synchronized (StudentSerivceGrpc.class) {
        if ((getGetStudentByAgeMethod = StudentSerivceGrpc.getGetStudentByAgeMethod) == null) {
          StudentSerivceGrpc.getGetStudentByAgeMethod = getGetStudentByAgeMethod = 
              io.grpc.MethodDescriptor.<com.jin.protocode.StudentRequest, com.jin.protocode.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.jin.proto.StudentSerivce", "GetStudentByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jin.protocode.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jin.protocode.StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentSerivceMethodDescriptorSupplier("GetStudentByAge"))
                  .build();
          }
        }
     }
     return getGetStudentByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jin.protocode.StudentRequest,
      com.jin.protocode.StudentResponseList> getGetStudentAgeStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentAgeStream",
      requestType = com.jin.protocode.StudentRequest.class,
      responseType = com.jin.protocode.StudentResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.jin.protocode.StudentRequest,
      com.jin.protocode.StudentResponseList> getGetStudentAgeStreamMethod() {
    io.grpc.MethodDescriptor<com.jin.protocode.StudentRequest, com.jin.protocode.StudentResponseList> getGetStudentAgeStreamMethod;
    if ((getGetStudentAgeStreamMethod = StudentSerivceGrpc.getGetStudentAgeStreamMethod) == null) {
      synchronized (StudentSerivceGrpc.class) {
        if ((getGetStudentAgeStreamMethod = StudentSerivceGrpc.getGetStudentAgeStreamMethod) == null) {
          StudentSerivceGrpc.getGetStudentAgeStreamMethod = getGetStudentAgeStreamMethod = 
              io.grpc.MethodDescriptor.<com.jin.protocode.StudentRequest, com.jin.protocode.StudentResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.jin.proto.StudentSerivce", "GetStudentAgeStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jin.protocode.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jin.protocode.StudentResponseList.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentSerivceMethodDescriptorSupplier("GetStudentAgeStream"))
                  .build();
          }
        }
     }
     return getGetStudentAgeStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jin.protocode.StreamRequest,
      com.jin.protocode.StreamResponse> getStreamToStreamTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamToStreamTalk",
      requestType = com.jin.protocode.StreamRequest.class,
      responseType = com.jin.protocode.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.jin.protocode.StreamRequest,
      com.jin.protocode.StreamResponse> getStreamToStreamTalkMethod() {
    io.grpc.MethodDescriptor<com.jin.protocode.StreamRequest, com.jin.protocode.StreamResponse> getStreamToStreamTalkMethod;
    if ((getStreamToStreamTalkMethod = StudentSerivceGrpc.getStreamToStreamTalkMethod) == null) {
      synchronized (StudentSerivceGrpc.class) {
        if ((getStreamToStreamTalkMethod = StudentSerivceGrpc.getStreamToStreamTalkMethod) == null) {
          StudentSerivceGrpc.getStreamToStreamTalkMethod = getStreamToStreamTalkMethod = 
              io.grpc.MethodDescriptor.<com.jin.protocode.StreamRequest, com.jin.protocode.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.jin.proto.StudentSerivce", "StreamToStreamTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jin.protocode.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jin.protocode.StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentSerivceMethodDescriptorSupplier("StreamToStreamTalk"))
                  .build();
          }
        }
     }
     return getStreamToStreamTalkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentSerivceStub newStub(io.grpc.Channel channel) {
    return new StudentSerivceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentSerivceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentSerivceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentSerivceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentSerivceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentSerivceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *main
     * </pre>
     */
    public void getRealName(com.jin.protocode.MyRequest request,
        io.grpc.stub.StreamObserver<com.jin.protocode.MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealNameMethod(), responseObserver);
    }

    /**
     */
    public void getStudentByAge(com.jin.protocode.StudentRequest request,
        io.grpc.stub.StreamObserver<com.jin.protocode.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jin.protocode.StudentRequest> getStudentAgeStream(
        io.grpc.stub.StreamObserver<com.jin.protocode.StudentResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentAgeStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *main
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.jin.protocode.StreamRequest> streamToStreamTalk(
        io.grpc.stub.StreamObserver<com.jin.protocode.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamToStreamTalkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jin.protocode.MyRequest,
                com.jin.protocode.MyResponse>(
                  this, METHODID_GET_REAL_NAME)))
          .addMethod(
            getGetStudentByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jin.protocode.StudentRequest,
                com.jin.protocode.StudentResponse>(
                  this, METHODID_GET_STUDENT_BY_AGE)))
          .addMethod(
            getGetStudentAgeStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.jin.protocode.StudentRequest,
                com.jin.protocode.StudentResponseList>(
                  this, METHODID_GET_STUDENT_AGE_STREAM)))
          .addMethod(
            getStreamToStreamTalkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.jin.protocode.StreamRequest,
                com.jin.protocode.StreamResponse>(
                  this, METHODID_STREAM_TO_STREAM_TALK)))
          .build();
    }
  }

  /**
   */
  public static final class StudentSerivceStub extends io.grpc.stub.AbstractStub<StudentSerivceStub> {
    private StudentSerivceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentSerivceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentSerivceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentSerivceStub(channel, callOptions);
    }

    /**
     * <pre>
     *main
     * </pre>
     */
    public void getRealName(com.jin.protocode.MyRequest request,
        io.grpc.stub.StreamObserver<com.jin.protocode.MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentByAge(com.jin.protocode.StudentRequest request,
        io.grpc.stub.StreamObserver<com.jin.protocode.StudentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStudentByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jin.protocode.StudentRequest> getStudentAgeStream(
        io.grpc.stub.StreamObserver<com.jin.protocode.StudentResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetStudentAgeStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *main
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.jin.protocode.StreamRequest> streamToStreamTalk(
        io.grpc.stub.StreamObserver<com.jin.protocode.StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamToStreamTalkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentSerivceBlockingStub extends io.grpc.stub.AbstractStub<StudentSerivceBlockingStub> {
    private StudentSerivceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentSerivceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentSerivceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentSerivceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *main
     * </pre>
     */
    public com.jin.protocode.MyResponse getRealName(com.jin.protocode.MyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.jin.protocode.StudentResponse> getStudentByAge(
        com.jin.protocode.StudentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStudentByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentSerivceFutureStub extends io.grpc.stub.AbstractStub<StudentSerivceFutureStub> {
    private StudentSerivceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentSerivceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentSerivceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentSerivceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *main
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jin.protocode.MyResponse> getRealName(
        com.jin.protocode.MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME = 0;
  private static final int METHODID_GET_STUDENT_BY_AGE = 1;
  private static final int METHODID_GET_STUDENT_AGE_STREAM = 2;
  private static final int METHODID_STREAM_TO_STREAM_TALK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentSerivceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentSerivceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME:
          serviceImpl.getRealName((com.jin.protocode.MyRequest) request,
              (io.grpc.stub.StreamObserver<com.jin.protocode.MyResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_BY_AGE:
          serviceImpl.getStudentByAge((com.jin.protocode.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.jin.protocode.StudentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT_AGE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentAgeStream(
              (io.grpc.stub.StreamObserver<com.jin.protocode.StudentResponseList>) responseObserver);
        case METHODID_STREAM_TO_STREAM_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamToStreamTalk(
              (io.grpc.stub.StreamObserver<com.jin.protocode.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentSerivceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentSerivceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jin.protocode.StudentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentSerivce");
    }
  }

  private static final class StudentSerivceFileDescriptorSupplier
      extends StudentSerivceBaseDescriptorSupplier {
    StudentSerivceFileDescriptorSupplier() {}
  }

  private static final class StudentSerivceMethodDescriptorSupplier
      extends StudentSerivceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentSerivceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentSerivceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentSerivceFileDescriptorSupplier())
              .addMethod(getGetRealNameMethod())
              .addMethod(getGetStudentByAgeMethod())
              .addMethod(getGetStudentAgeStreamMethod())
              .addMethod(getStreamToStreamTalkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
