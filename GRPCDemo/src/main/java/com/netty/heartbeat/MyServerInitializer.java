package com.netty.heartbeat;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

public class MyServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline channelPipeline = ch.pipeline();
        //heart beat handler
        channelPipeline.addLast(new IdleStateHandler(5, 7, 10));
        channelPipeline.addLast("asdfadf", (ChannelHandler) new MyServerHandler());

    }
}
