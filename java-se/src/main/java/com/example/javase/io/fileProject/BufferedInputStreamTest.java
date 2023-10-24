package com.example.javase.io.fileProject;

import java.io.*;

/**
 * @author ms
 * @date 2023/10/20 14:59
 */
public class BufferedInputStreamTest {

    //读取文件
    public static void testReadFile_1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("testDoc.txt"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int data = bufferedInputStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = bufferedInputStream.read();
        }

        bufferedInputStream.close();
    }

    public static void testReadFile_2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("testDoc.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 8);

        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = bufferedInputStream.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }

        bufferedInputStream.close();
    }

    public static void main(String[] args) throws IOException {
        testReadFile_2();
    }
}
