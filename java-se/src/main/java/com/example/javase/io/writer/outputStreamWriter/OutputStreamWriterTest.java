package com.example.javase.io.writer.outputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 10:40
 */
public class OutputStreamWriterTest {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("./template/fileTest.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            osw.write("Hello world!!!");
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
