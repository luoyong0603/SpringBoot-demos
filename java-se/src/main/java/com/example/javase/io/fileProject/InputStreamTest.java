package com.example.javase.io.fileProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 喵手
 * @Date 2023-10-18 22:32
 */
public class InputStreamTest {

    public static void testInputStream_1() throws IOException {
        InputStream in = new FileInputStream("testDoc.txt");
        byte[] buffer = new byte[1024];
        int length = in.read(buffer);
        while (length != -1) {
            System.out.write(buffer, 0, length);
            length = in.read(buffer);
        }
        in.close();
    }

    public static void main(String[] args) throws IOException {
        testInputStream_1();
    }
}
