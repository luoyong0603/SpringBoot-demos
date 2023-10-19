package com.example.javase.io.reader.bufferedReader;

import java.io.*;
import java.net.URL;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/18 14:23
 */
public class BufferedReaderTest {

    //读取指定文件内容
    public static void testReadFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./template/fileTest.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //读取url内容
    public static void testReadURL() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("https://www.baidu.com/").openStream()));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testReadFile();
        testReadURL();
    }
}
