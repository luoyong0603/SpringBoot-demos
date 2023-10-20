package com.example.javase.io.fileProject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 喵手
 * @version 1.0
 * @date 2023/10/20 15:41
 */
public class OutputStreamTest {

    public static void test_1() throws IOException {
        FileOutputStream fos = new FileOutputStream("testDoc.txt");
        byte[] data = "Hello, world!!!".getBytes();
        fos.write(data);
        fos.close();
    }

    public static void test_2() throws IOException {
        OutputStream os = new FileOutputStream("testDoc.txt");
        os.write("Hello, World!!!!".getBytes());
        os.flush();
        os.close();
        System.out.println("写入成功！");
    }

    public static void main(String[] args) throws IOException {
        test_2();
    }

}
