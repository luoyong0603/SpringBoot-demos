package com.example.javase.io.writer;

import java.io.*;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 16:38
 */
public class WriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("./template/fileTest.txt");
            writer.write("hello world，jym！！！");
            writer.close();
            System.out.println("Write Successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
