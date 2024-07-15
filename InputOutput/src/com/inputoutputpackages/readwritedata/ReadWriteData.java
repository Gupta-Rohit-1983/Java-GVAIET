package com.inputoutputpackages.readwritedata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
// import java.util.Arrays;
import java.util.StringTokenizer;

public class ReadWriteData {

    public static void main(String[] args) throws IOException {
        
        // input keyword

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // try {
        //     System.out.println("Enter Number:");
        //     // int number = Integer.parseInt(br.readLine());
        //     // System.out.println(number);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }finally{
        //     // isr.close();
        //     // br.close();
        // }

        // file read write Operation

        String line = "";
        StringBuilder sBuilder = new StringBuilder();


        try(
            Writer fr = new FileWriter("demo.txt");
            BufferedWriter bw = new BufferedWriter(fr);
        ){

            while (!line.equals("$")) {
                line = br.readLine();
                if (!line.equals("$")) {
                    bw.write(line);
                    bw.newLine();
                }
                
            }
        

        }

        try(
            BufferedReader br1 = new BufferedReader(new FileReader("demo.txt"));
        ){

            // while (line != null) {
            //     line = br1.readLine();
            //     System.out.println(line);
            // }

            while((line = br1.readLine())!=null){
                sBuilder.append(line);
                System.out.println(line);
            }
        }
        
        System.out.println("sBuilder : "+sBuilder.toString());

        StringTokenizer tokens = new StringTokenizer(sBuilder.toString(),"[,.; ]");
        String[] tokenArray = new String[tokens.countTokens()];
        int i = 0;

        while (tokens.hasMoreTokens()) {
            tokenArray[i++] = tokens.nextToken();
            
        }
        // System.out.println(Arrays.toString(tokenArray));
        int count = 0;
        for (String string : tokenArray) {
            if (string.equalsIgnoreCase("shelu")) {
                count ++;
            }
        }

        System.out.println("Shelu :"+ count);
    }

}
