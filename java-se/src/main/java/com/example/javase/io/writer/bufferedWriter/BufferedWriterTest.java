package com.example.javase.io.writer.bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 10:41
 */
public class BufferedWriterTest {

    public static void main(String[] args) throws IOException {
        // 创建一个文件写入流
        FileWriter fileWriter = new FileWriter("./template/fileTest.txt");

        // 创建一个缓冲区写入流
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // 写入文本数据
        bufferedWriter.write("hello world，jym！！！");

        // 刷新缓冲区
        bufferedWriter.flush();

        // 关闭缓冲区写入流和文件写入流
        bufferedWriter.close();
        fileWriter.close();
    }
}
