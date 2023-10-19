package com.example.javase.io.writer;

import java.io.*;
import java.net.Socket;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 16:38
 */
public class WriterTest {

    //将数据写入文件
    public static void testFileWriter() {
        try {
            FileWriter writer = new FileWriter("./template/fileTest.txt");
            writer.write("hello world，jym！！！");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //将数据在控制台输出
    public static void testFilePrint() {
        Writer writer = new OutputStreamWriter(System.out);
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println("Hello World!");
        printWriter.flush();
        printWriter.close();
    }

    public static void main(String[] args) {
        testFilePrint();
    }


}
