package com.example.javase.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author bug菌
 * @Date 2023-09-18 0:04
 */
public class BufferedWriterTest {

    private static final int DATA_SIZE = 100000;

    public static void main(String[] args) throws IOException {
        long start, end;

        // 使用FileWriter进行文件写入
        FileWriter fileWriter = new FileWriter("./template/output.txt");
        start = System.currentTimeMillis();
        for (int i = 0; i < DATA_SIZE; i++) {
            fileWriter.write("Hello, world!");
            fileWriter.write(System.getProperty("line.separator"));
        }
        fileWriter.close();
        end = System.currentTimeMillis();
        System.out.println("使用FileWriter进行文件写入的耗时：" + (end - start) + "毫秒");

        // 使用BufferedWriter进行文件写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./template/output.txt"));
        start = System.currentTimeMillis();
        for (int i = 0; i < DATA_SIZE; i++) {
            bufferedWriter.write("Hello, world!");
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        end = System.currentTimeMillis();
        System.out.println("使用BufferedWriter进行文件写入的耗时：" + (end - start) + "毫秒");
    }


}
