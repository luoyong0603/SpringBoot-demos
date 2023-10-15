package com.example.javase.io.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author bug菌
 * @Date 2023-10-15 19:13
 */
public class OutputStreamTest {

    public static void main(String[] args) throws IOException {
        String str = "Hello, jym!";
        byte[] data = str.getBytes();
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream("./template/hello.txt");
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
