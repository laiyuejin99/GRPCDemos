package com.jin.server;

import com.jin.test4.HeaderServerInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerMain {
    private Server server;

    private void start() throws IOException {
        this.server = ServerBuilder.forPort(8899)
                .addService(new StudentServerImpl())
                .build()
                .start();
        System.out.println("server start!!");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("jvm shut down");
            ServerMain.this.stop();
        }));

        System.out.println("server start success!!");
    }

    private void stop() {
        if (null != this.server) {
            this.server.shutdown();
        }
    }

    private void awaitTermination() throws InterruptedException {
        if (null != this.server) {
            this.server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {
        ServerMain serverMain = new ServerMain();
        serverMain.start();

        serverMain.awaitTermination();
    }

}
