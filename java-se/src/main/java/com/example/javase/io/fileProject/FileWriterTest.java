package com.example.javase.io.fileProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 喵手
 * @Date 2023-10-18 22:03
 */
public class FileWriterTest {

    public static void testFileWriter_1() {
        try {
            String content = "Hello,World!";
            File file = new File("testDoc.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testFileWriter_2() {
        File file = new File("testDoc.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello,World!!!");
            writer.close();
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        testFileWriter_2();
    }

}
