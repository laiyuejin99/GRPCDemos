package com.jin.test4;

import io.grpc.ManagedChannel;

public class ChannelStatusChecker extends Thread {
    ManagedChannel channel;

    public ChannelStatusChecker(ManagedChannel channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.println("channel status" + channel.getState(false));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}