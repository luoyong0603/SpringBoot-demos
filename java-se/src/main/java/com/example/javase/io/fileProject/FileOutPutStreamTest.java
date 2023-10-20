package com.example.javase.io.fileProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 喵手
 * @version 1.0
 * @date 2023/10/20 16:30
 */
public class FileOutPutStreamTest {

    public static void test_1() throws IOException {
        String data = "Hello, world!!";
        // 以追加的方式创建FileOutputStream对象
        FileOutputStream fos = new FileOutputStream("testDoc.txt", true);
        // 将数据转为字节数组
        byte[] b = data.getBytes();
        // 写入数据到文件中
        fos.write(b);
        // 关闭文件输出流
        fos.close();
    }

    //文件内容拷贝
    public static void test_2(File source, File dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        }
    }

    public static void test_3() throws IOException {
        // 创建文件输出流对象
        FileOutputStream outputStream = new FileOutputStream("testDoc.txt");
        String data = "Hello, FileOutputStream!";
        // 将数据写入到文件
        outputStream.write(data.getBytes());
        // 关闭流
        outputStream.close();
        System.out.println("数据写入文件成功！");
    }

    public static void main(String[] args) throws IOException {
        test_3();
    }


}
