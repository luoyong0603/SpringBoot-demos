package com.example.javase.io;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

/**
 * @date 2023/9/12 15:31
 */
@SpringBootTest
public class BufferedReaderTest {

    @Test
    public void testFileReader() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./template/hello.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            isr.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
