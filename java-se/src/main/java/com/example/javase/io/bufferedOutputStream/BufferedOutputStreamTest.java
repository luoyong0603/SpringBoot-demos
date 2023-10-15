package com.example.javase.io.bufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * @Author bug菌
 * @Date 2023-10-15 20:29
 */
public class BufferedOutputStreamTest {

    public static void main(String[] args) throws Exception {
        String text = "hello world，jym！！！";
        int count = 1000000;

        long start1 = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream("./template/hello.txt");
        for (int i = 0; i < count; i++) {
            fos.write(text.getBytes());
        }
        fos.close();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./template/hello.txt"));
        for (int i = 0; i < count; i++) {
            bos.write(text.getBytes());
        }
        bos.close();
        long end2 = System.currentTimeMillis();

        System.out.println("普通输出流耗时：" + (end1 - start1) + "ms");
        System.out.println("带缓存输出流耗时：" + (end2 - start2) + "ms");
    }
}
