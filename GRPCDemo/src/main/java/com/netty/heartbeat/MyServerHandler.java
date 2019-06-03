package com.netty.heartbeat;

import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter;
import io.grpc.netty.shaded.io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;

public class MyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            String eventType = null;
            switch (event.state()) {
                case READER_IDLE:
                    eventType = "ready IDLE";
                    break;
                case WRITER_IDLE:
                    eventType = "write IDLE";
                    break;
                case ALL_IDLE:
                    eventType = "read and write IDEL";
                    break;
            }
            System.out.println(ctx.channel().remoteAddress() + " time out event " + eventType);
            ctx.channel().close();
        }
    }
}
