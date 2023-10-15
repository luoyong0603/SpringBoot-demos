package com.example.javase.io.fileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author bug菌
 * @Date 2023-10-15 19:40
 */
public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {
        String data = "Hello, world，jym!";
        File file = new File("./template/hello.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        fis.read(buffer);
        String result = new String(buffer).trim();
        fis.close();

        if (data.equals(result)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
