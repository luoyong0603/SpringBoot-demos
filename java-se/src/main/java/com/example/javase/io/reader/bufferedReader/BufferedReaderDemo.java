package com.example.javase.io.reader.bufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/18 14:15
 */
public class BufferedReaderDemo {

    public static void main(String[] args) {
        File file = new File("./template/fileTest.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            //读取读取文件内容并打印
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
