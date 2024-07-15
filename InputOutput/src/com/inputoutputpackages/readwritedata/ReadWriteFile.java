package com.inputoutputpackages.readwritedata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadWriteFile {

    public static void main(String[] args) {
        
        try (
            FileOutputStream fos = new FileOutputStream("demo.txt");
            FileChannel channel = fos.getChannel();

        ) {
            ByteBuffer buffer = ByteBuffer.allocate(100);
            channel.write(buffer);
            
        } catch (Exception e) {
            // TODO: handle exception
        }


        try (
            FileInputStream fis = new FileInputStream("demo.txt");
            FileChannel channel = fis.getChannel();
        ){
          ByteBuffer buffer = ByteBuffer.allocate(1024);
          int charVar = channel.read(buffer);  
          while (charVar != -1) {

            buffer.flip();
            System.out.println((char) charVar);
            

            charVar = channel.read(buffer);
          }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
