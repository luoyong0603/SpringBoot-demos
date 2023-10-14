package com.example.javase.io.fileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/13 16:31
 */
public class testReadFile {

    public static void main(String[] args) {
        String content = "Hello, jym! ";
        byte[] contentBytes = content.getBytes();
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("./template/hello.txt");
            outputStream.write(contentBytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("./template/hello.txt");
            byte[] buffer = new byte[contentBytes.length];
            inputStream.read(buffer);
            String result = new String(buffer);
            System.out.println("content:" + content);
            System.out.println("result:" + result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}