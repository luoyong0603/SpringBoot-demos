package com.example.javase.io.fileProject;

import java.io.*;

/**
 * @Author ms
 * @Date 2023-10-18 20:53
 */
public class WriterTest {


    public static void testWriter_1() {
        String str = "Hello, world!";
        File file = new File("testDoc.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testWriter_2() {
        String str = "Hello, world!!!!";
        File file = new File("testDoc.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testWriter_3() {
        String str = "Hello, world!!!!!!!";
        File file = new File("testDoc.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String content = reader.readLine();
            System.out.println("content:"+content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        testWriter_3();
    }


}
