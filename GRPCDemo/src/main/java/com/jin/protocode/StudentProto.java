// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.jin.protocode;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jin_proto_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jin_proto_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jin_proto_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jin_proto_MyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jin_proto_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jin_proto_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jin_proto_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jin_proto_StudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jin_proto_StudentResponseList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jin_proto_StudentResponseList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jin_proto_StreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jin_proto_StreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jin_proto_StreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jin_proto_StreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\022\rcom.jin.proto\"\035\n\tMyRequ" +
      "est\022\020\n\010username\030\001 \001(\t\"\036\n\nMyResponse\022\020\n\010r" +
      "ealname\030\001 \001(\t\"\035\n\016StudentRequest\022\013\n\003age\030\001" +
      " \001(\005\":\n\017StudentResponse\022\014\n\004name\030\001 \001(\t\022\013\n" +
      "\003age\030\002 \001(\005\022\014\n\004city\030\003 \001(\t\"N\n\023StudentRespo" +
      "nseList\0227\n\017studentResponse\030\001 \003(\0132\036.com.j" +
      "in.proto.StudentResponse\"G\n\rStreamReques" +
      "t\022\023\n\013requestInfo\030\001 \001(\t\022\023\n\013requestTime\030\002 " +
      "\001(\003\022\014\n\004UUID\030\003 \001(\t\"I\n\016StreamResponse\022\024\n\014r" +
      "esponseInfo\030\001 \001(\t\022\023\n\013receiveTime\030\002 \001(\003\022\014" +
      "\n\004UUID\030\003 \001(\t2\343\002\n\016StudentSerivce\022D\n\013GetRe" +
      "alName\022\030.com.jin.proto.MyRequest\032\031.com.j" +
      "in.proto.MyResponse\"\000\022T\n\017GetStudentByAge" +
      "\022\035.com.jin.proto.StudentRequest\032\036.com.ji" +
      "n.proto.StudentResponse\"\0000\001\022\\\n\023GetStuden" +
      "tAgeStream\022\035.com.jin.proto.StudentReques" +
      "t\032\".com.jin.proto.StudentResponseList\"\000(" +
      "\001\022W\n\022StreamToStreamTalk\022\034.com.jin.proto." +
      "StreamRequest\032\035.com.jin.proto.StreamResp" +
      "onse\"\000(\0010\001B#\n\021com.jin.protocodeB\014Student" +
      "ProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_jin_proto_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jin_proto_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jin_proto_MyRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_com_jin_proto_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_jin_proto_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jin_proto_MyResponse_descriptor,
        new java.lang.String[] { "Realname", });
    internal_static_com_jin_proto_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_jin_proto_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jin_proto_StudentRequest_descriptor,
        new java.lang.String[] { "Age", });
    internal_static_com_jin_proto_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_jin_proto_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jin_proto_StudentResponse_descriptor,
        new java.lang.String[] { "Name", "Age", "City", });
    internal_static_com_jin_proto_StudentResponseList_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_jin_proto_StudentResponseList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jin_proto_StudentResponseList_descriptor,
        new java.lang.String[] { "StudentResponse", });
    internal_static_com_jin_proto_StreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_jin_proto_StreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jin_proto_StreamRequest_descriptor,
        new java.lang.String[] { "RequestInfo", "RequestTime", "UUID", });
    internal_static_com_jin_proto_StreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_jin_proto_StreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jin_proto_StreamResponse_descriptor,
        new java.lang.String[] { "ResponseInfo", "ReceiveTime", "UUID", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
