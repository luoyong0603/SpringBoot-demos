package com.example.javase.io.fileProject;


import java.io.*;

/**
 * @Author 喵手
 * @Date 2023-10-18 21:23
 */
public class BufferedWriterTest {


    public static void testBufferedWriter_1() {
        File file = new File("testDoc.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 1; i <= 10; i++) {
                writer.write("line:" + i);
                writer.newLine();  // 换行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testBufferedWriter_2() {
        File file = new File("testDoc.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("hello");
            writer.newLine();
            writer.write("world");
            writer.flush();

            //输出文件内容
            System.out.println(readFileContent(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFileContent(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }


    public static void main(String[] args) {
        testBufferedWriter_2();
    }
}
