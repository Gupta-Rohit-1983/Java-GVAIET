package com.serverchannelscoket;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;


public class ServerChannelSocket {

    public static void main(String[] args) {
        
        int port = 9090;

        try (
            ServerSocketChannel server =ServerSocketChannel.open();
        ) {
            server.bind(new InetSocketAddress(port));
            System.out.println("Server start at : "+ port);
            while (true) {
                
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
