package com.example.javase.io.fileProject;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * @author 喵手
 * @version 1.0
 * @date 2023/10/20 17:21
 */
public class FilterOutputStreamTest {

    public static void test_1() throws IOException {
        String str = "Hello, FilterOutputStream!";
        FileOutputStream fos = new FileOutputStream("testDoc.txt");
        FilterOutputStream fosFilter = new FilterOutputStream(fos);
        fosFilter.write(str.getBytes());
        fosFilter.flush();
        fosFilter.close();
        System.out.println("文件内容写入成功！");
    }

    public static void test_2() throws IOException {
        FileOutputStream fos = new FileOutputStream("testDoc.txt");
        GZIPOutputStream gzos = new GZIPOutputStream(new BufferedOutputStream(fos));
        FilterOutputStream fosFilter = new FilterOutputStream(gzos);
    }

    public static void main(String[] args) throws IOException {
        test_2();
    }

}
