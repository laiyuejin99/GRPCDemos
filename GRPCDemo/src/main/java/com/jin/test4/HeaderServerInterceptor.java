package com.jin.test4;

import io.grpc.*;

import java.util.logging.Logger;

public class HeaderServerInterceptor implements ServerInterceptor {

    private static final Logger logger = Logger.getLogger(HeaderServerInterceptor.class.getName());

    static final Metadata.Key<String> CUSTOM_HEADER_KEY =
            Metadata.Key.of("custom_server_header_key", Metadata.ASCII_STRING_MARSHALLER);


    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            final Metadata requestHeaders,
            ServerCallHandler<ReqT, RespT> next) {
        logger.info("header received from client:" + requestHeaders);
        ServerCall.Listener listener = next.startCall(new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
            @Override
            public void sendHeaders(Metadata responseHeaders) {
                responseHeaders.put(CUSTOM_HEADER_KEY, "server response header!!");
                super.sendHeaders(responseHeaders);
            }
        }, requestHeaders);

        listener.onReady();
        return listener;
    }
}