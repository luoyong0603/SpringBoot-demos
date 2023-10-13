package com.example.javase.io.bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/13 17:51
 */
public class BufferedInputStreamTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./template/hello.txt"))) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = bis.read(buffer)) != -1) {
                String content = new String(buffer, 0, length);
                System.out.println("读取内容为：" + content);
            }
        } catch (IOException e) {
            // handle exception
        }
        long end = System.currentTimeMillis();
        System.out.println("Time used: " + (end - start) + "ms");
    }

}
