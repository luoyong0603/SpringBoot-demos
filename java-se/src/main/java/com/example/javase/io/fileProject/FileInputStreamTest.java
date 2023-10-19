package com.example.javase.io.fileProject;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author 喵手
 * @Date 2023-10-19 23:19
 */
public class FileInputStreamTest {


    //读取文本文件
    public static void testFile_1() {
        try {
            FileInputStream fis = new FileInputStream("testDoc.txt");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //读取图片文件
    public static void testFile_2() {
        try {
            FileInputStream fis = new FileInputStream("java.jpg");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testFile_1();
    }


}
