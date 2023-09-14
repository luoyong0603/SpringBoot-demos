package com.example.javase.io;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

/**
 * @date 2023/9/12 15:09
 */
@SpringBootTest
public class ReaderTest {

    @Test
    public void fileReaderTest() throws IOException {
        FileReader reader = null;
        reader = new FileReader("./template/hello.txt");

        int data = reader.read();
        while (data != -1) {
            char ch = (char) data;
            System.out.print(ch);
            data = reader.read();
        }
    }


    @Test
    public void testFileReader() {
        try {
            FileReader reader = new FileReader("./template/hello.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBufferedReader() {
        try {
            FileReader reader = new FileReader("./template/hello.txt");
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testInputStreamReader() {
        try {
            InputStream is = new FileInputStream("./template/hello.txt");
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            isr.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
