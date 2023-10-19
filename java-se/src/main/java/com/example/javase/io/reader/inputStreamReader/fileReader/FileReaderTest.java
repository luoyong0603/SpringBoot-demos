package com.example.javase.io.reader.inputStreamReader.fileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 10:37
 */
public class FileReaderTest {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("./template/fileTest.txt")) {
            char[] buffer = new char[1024];
            int length;
            while ((length = reader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
