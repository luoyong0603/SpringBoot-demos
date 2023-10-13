package com.example.javase.io.filterInputStream;

import java.io.*;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/13 16:51
 */
public class FilterInputStreamDemo {

    public static void main(String[] args) throws IOException {
        // create file
        File file = new File("./template/hello.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("hello world".getBytes());
        fos.close();

        // create counting input stream
        CountingInputStream cis = new CountingInputStream(new FileInputStream(file));

        // read input stream
        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead = cis.read(buffer)) != -1) {
            // process buffer
        }
        // verify count
        System.out.println(cis.getCount());

        // delete file
        file.delete();
    }


}
