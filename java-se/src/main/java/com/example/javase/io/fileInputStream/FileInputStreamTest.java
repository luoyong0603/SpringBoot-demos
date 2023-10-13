package com.example.javase.io.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/13 15:56
 */
public class FileInputStreamTest {

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("./template/hello.txt");

            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.print((char) content);
            }
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
