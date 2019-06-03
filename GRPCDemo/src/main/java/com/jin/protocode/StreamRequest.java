// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.jin.protocode;

/**
 * <pre>
 *test 4
 * </pre>
 *
 * Protobuf type {@code com.jin.proto.StreamRequest}
 */
public  final class StreamRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.jin.proto.StreamRequest)
    StreamRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamRequest.newBuilder() to construct.
  private StreamRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamRequest() {
    requestInfo_ = "";
    uUID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            requestInfo_ = s;
            break;
          }
          case 16: {

            requestTime_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            uUID_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jin.protocode.StudentProto.internal_static_com_jin_proto_StreamRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jin.protocode.StudentProto.internal_static_com_jin_proto_StreamRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jin.protocode.StreamRequest.class, com.jin.protocode.StreamRequest.Builder.class);
  }

  public static final int REQUESTINFO_FIELD_NUMBER = 1;
  private volatile java.lang.Object requestInfo_;
  /**
   * <code>string requestInfo = 1;</code>
   */
  public java.lang.String getRequestInfo() {
    java.lang.Object ref = requestInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string requestInfo = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRequestInfoBytes() {
    java.lang.Object ref = requestInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUESTTIME_FIELD_NUMBER = 2;
  private long requestTime_;
  /**
   * <code>int64 requestTime = 2;</code>
   */
  public long getRequestTime() {
    return requestTime_;
  }

  public static final int UUID_FIELD_NUMBER = 3;
  private volatile java.lang.Object uUID_;
  /**
   * <code>string UUID = 3;</code>
   */
  public java.lang.String getUUID() {
    java.lang.Object ref = uUID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uUID_ = s;
      return s;
    }
  }
  /**
   * <code>string UUID = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUUIDBytes() {
    java.lang.Object ref = uUID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uUID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRequestInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestInfo_);
    }
    if (requestTime_ != 0L) {
      output.writeInt64(2, requestTime_);
    }
    if (!getUUIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uUID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRequestInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestInfo_);
    }
    if (requestTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, requestTime_);
    }
    if (!getUUIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uUID_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.jin.protocode.StreamRequest)) {
      return super.equals(obj);
    }
    com.jin.protocode.StreamRequest other = (com.jin.protocode.StreamRequest) obj;

    if (!getRequestInfo()
        .equals(other.getRequestInfo())) return false;
    if (getRequestTime()
        != other.getRequestTime()) return false;
    if (!getUUID()
        .equals(other.getUUID())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQUESTINFO_FIELD_NUMBER;
    hash = (53 * hash) + getRequestInfo().hashCode();
    hash = (37 * hash) + REQUESTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestTime());
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUUID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jin.protocode.StreamRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jin.protocode.StreamRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jin.protocode.StreamRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jin.protocode.StreamRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jin.protocode.StreamRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jin.protocode.StreamRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jin.protocode.StreamRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jin.protocode.StreamRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jin.protocode.StreamRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jin.protocode.StreamRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jin.protocode.StreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jin.protocode.StreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.jin.protocode.StreamRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *test 4
   * </pre>
   *
   * Protobuf type {@code com.jin.proto.StreamRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.jin.proto.StreamRequest)
      com.jin.protocode.StreamRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jin.protocode.StudentProto.internal_static_com_jin_proto_StreamRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jin.protocode.StudentProto.internal_static_com_jin_proto_StreamRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jin.protocode.StreamRequest.class, com.jin.protocode.StreamRequest.Builder.class);
    }

    // Construct using com.jin.protocode.StreamRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      requestInfo_ = "";

      requestTime_ = 0L;

      uUID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jin.protocode.StudentProto.internal_static_com_jin_proto_StreamRequest_descriptor;
    }

    @java.lang.Override
    public com.jin.protocode.StreamRequest getDefaultInstanceForType() {
      return com.jin.protocode.StreamRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.jin.protocode.StreamRequest build() {
      com.jin.protocode.StreamRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jin.protocode.StreamRequest buildPartial() {
      com.jin.protocode.StreamRequest result = new com.jin.protocode.StreamRequest(this);
      result.requestInfo_ = requestInfo_;
      result.requestTime_ = requestTime_;
      result.uUID_ = uUID_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.jin.protocode.StreamRequest) {
        return mergeFrom((com.jin.protocode.StreamRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jin.protocode.StreamRequest other) {
      if (other == com.jin.protocode.StreamRequest.getDefaultInstance()) return this;
      if (!other.getRequestInfo().isEmpty()) {
        requestInfo_ = other.requestInfo_;
        onChanged();
      }
      if (other.getRequestTime() != 0L) {
        setRequestTime(other.getRequestTime());
      }
      if (!other.getUUID().isEmpty()) {
        uUID_ = other.uUID_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.jin.protocode.StreamRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jin.protocode.StreamRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object requestInfo_ = "";
    /**
     * <code>string requestInfo = 1;</code>
     */
    public java.lang.String getRequestInfo() {
      java.lang.Object ref = requestInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string requestInfo = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequestInfoBytes() {
      java.lang.Object ref = requestInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string requestInfo = 1;</code>
     */
    public Builder setRequestInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string requestInfo = 1;</code>
     */
    public Builder clearRequestInfo() {
      
      requestInfo_ = getDefaultInstance().getRequestInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string requestInfo = 1;</code>
     */
    public Builder setRequestInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestInfo_ = value;
      onChanged();
      return this;
    }

    private long requestTime_ ;
    /**
     * <code>int64 requestTime = 2;</code>
     */
    public long getRequestTime() {
      return requestTime_;
    }
    /**
     * <code>int64 requestTime = 2;</code>
     */
    public Builder setRequestTime(long value) {
      
      requestTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 requestTime = 2;</code>
     */
    public Builder clearRequestTime() {
      
      requestTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object uUID_ = "";
    /**
     * <code>string UUID = 3;</code>
     */
    public java.lang.String getUUID() {
      java.lang.Object ref = uUID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uUID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string UUID = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUUIDBytes() {
      java.lang.Object ref = uUID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uUID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string UUID = 3;</code>
     */
    public Builder setUUID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uUID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string UUID = 3;</code>
     */
    public Builder clearUUID() {
      
      uUID_ = getDefaultInstance().getUUID();
      onChanged();
      return this;
    }
    /**
     * <code>string UUID = 3;</code>
     */
    public Builder setUUIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uUID_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.jin.proto.StreamRequest)
  }

  // @@protoc_insertion_point(class_scope:com.jin.proto.StreamRequest)
  private static final com.jin.protocode.StreamRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jin.protocode.StreamRequest();
  }

  public static com.jin.protocode.StreamRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamRequest>
      PARSER = new com.google.protobuf.AbstractParser<StreamRequest>() {
    @java.lang.Override
    public StreamRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jin.protocode.StreamRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

