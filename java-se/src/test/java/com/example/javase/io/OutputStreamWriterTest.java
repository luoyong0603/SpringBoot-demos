package com.example.javase.io;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

/**
 * @Date 2023-09-21 23:10
 */
@SpringBootTest
public class OutputStreamWriterTest {


    @Test
    public void test() throws IOException {

        String str = "Hello, Java!";
        FileOutputStream fos = new FileOutputStream("./template/hello.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

        osw.write(str);
        osw.flush();
        osw.close();

        FileInputStream fis = new FileInputStream("./template/hello.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        isr.close();
        fis.close();
    }


}
