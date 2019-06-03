package com.jin.test4;

import io.grpc.*;

import java.util.logging.Logger;

public class HeaderClientInterceptor implements ClientInterceptor {

    private static final Logger logger = Logger.getLogger(HeaderClientInterceptor.class.getName());

    static final Metadata.Key<String> CUSTOM_HEADER_KEY = Metadata.Key.of("custom_client_header_key", Metadata.ASCII_STRING_MARSHALLER);

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
                                                               CallOptions callOptions, Channel next) {
        System.out.println("interceptor print info:");

        System.out.println("method :" + method);
        System.out.println("call options :" + callOptions);
        long startTime = System.currentTimeMillis();


        ClientCall<ReqT, RespT> call = new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

            @Override
            public void sendMessage(ReqT message) {
                super.sendMessage(message);
                System.out.println("request message  = " + message);
            }


            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                /* put custom header */
                headers.put(CUSTOM_HEADER_KEY, "andy custom request header Value");//client


                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                    //after response
                    @Override
                    public void onHeaders(Metadata headers) {
                        System.out.println("header received from server:" + headers);//re
                        super.onHeaders(headers);
                        System.out.println("interceptor time duration = " + (System.currentTimeMillis() - startTime));
                    }
                }, headers);
            }
        };
        return call;
    }
}