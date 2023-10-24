package com.example.javase.io.fileProject;

import java.io.*;

/**
 * @Author ms
 * @Date 2023-10-18 21:41
 */
public class OutputStreamWriterTest {

    public static void testOutputStreamWriter_1() {
        try {
            String fileName = "testDoc.txt";
            OutputStream outputStream = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
            writer.write("Hello,World!");
            writer.close();
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testOutputStreamWriter_2() {
        try {
            String fileName = "testDoc.txt";
            OutputStream outputStream = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
            writer.write("Hello,World!!!!!!");
            writer.close();
            InputStream inputStream = new FileInputStream(fileName);
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            String str = new String(bytes, "UTF-8");
            System.out.println("str: " + str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testOutputStreamWriter_2();
    }
}
