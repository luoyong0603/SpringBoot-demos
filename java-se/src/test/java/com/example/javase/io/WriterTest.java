package com.example.javase.io;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

/**
 * @Date 2023-09-17 23:26
 */
@SpringBootTest
public class WriterTest {


    @Test
    public void testWriter() {
        //使用Writer类将字符串写入到文件
        try {
            FileWriter fileWriter = new FileWriter("./template/output.txt");
            Writer writer = new BufferedWriter(fileWriter);
            writer.write("Hello, World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFileWriter() {
        //使用FileWriter将数据写入到文件中
        try {
            FileWriter writer = new FileWriter("./template/output.txt");
            writer.write("Hello, World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBufferedWriter() {
        //使用BufferedWriter将数据写入到文件中
        try {
            // 打开文件
            FileWriter fileWriter = new FileWriter("./template/output.txt");
            // 创建缓存写入流
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // 写入数据
            bufferedWriter.write("Hello, World!");
            // 关闭缓存和文件
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //使用BufferedWriter进行字符流写入
    @Test
    public void BufferedWriterExample() throws IOException{
        // 打开文件
        FileWriter fileWriter = new FileWriter("./template/output.txt");
        // 创建缓存写入流
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // 写入数据
        bufferedWriter.write("Hello, world!");
        bufferedWriter.newLine();
        bufferedWriter.write("This is an example of BufferedWriter.");
        // 关闭缓存和文件
        bufferedWriter.close();
        fileWriter.close();
    }


    //使用BufferedWriter进行字节流写入
    @Test
    public void BufferedWriterExampleForFileOutputStream() throws IOException{
        // 打开文件
        FileOutputStream fileOutputStream = new FileOutputStream("./template/output.txt");
        // 创建缓存写入流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        // 写入数据
        bufferedWriter.write("Hello, world!");
        bufferedWriter.newLine();
        bufferedWriter.write("This is an example of BufferedWriter.");
        // 关闭缓存和文件
        bufferedWriter.close();
        fileOutputStream.close();
    }


    @Test
    public void testPrintWriter() {
        //使用PrintWriter将数据写入到文件中
        try {
            PrintWriter writer = new PrintWriter("./template/output.txt");
            writer.println("Hello, World!");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPrintWriterAndRead() {
        //写入并读取
        try {
            PrintWriter writer = new PrintWriter("./template/output.txt");
            writer.println("Hello, World!");
            writer.close();
            String content = FileUtils.readFileToString(new File("./template/output.txt"), "UTF-8");
            Assert.assertEquals("Hello, World!\r\n", content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
