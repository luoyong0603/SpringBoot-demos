package com.example.javase.io.writer.outputStreamWriter.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 10:40
 */
public class FileWriterTest {

    public static void writeLog(String log) throws IOException {
        FileWriter fw = new FileWriter("./template/fileTest.txt", true);
        fw.write(log + "\n");
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "./template/fileTest.txt";
        String content = "Hello world!my jym！！";
        FileWriter fw = new FileWriter(filePath);
        fw.write(content);
        fw.close();
    }
}
