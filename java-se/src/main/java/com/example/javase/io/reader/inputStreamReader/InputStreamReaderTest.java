package com.example.javase.io.reader.inputStreamReader;

import java.io.*;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 10:37
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("./template/fileTest.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();
        System.out.println("line:" + line);
        br.close();
        isr.close();
        fis.close();
    }
}
