package com.example.javase.io.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 10:34
 */
public class ReaderTest {

    public static void main(String[] args) throws IOException {
        File file = new File("./template/fileTest.txt");
        Reader reader = new FileReader(file);

        char[] buffer = new char[1024];
        int len;
        while ((len = reader.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        reader.close();
    }
}
