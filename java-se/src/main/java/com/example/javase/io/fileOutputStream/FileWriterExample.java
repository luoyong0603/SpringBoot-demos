package com.example.javase.io.fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author bug菌
 * @Date 2023-10-15 19:44
 */
public class FileWriterExample {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./template/hello.txt");
        String data = "Hello, world!";
        byte[] bytes = data.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
