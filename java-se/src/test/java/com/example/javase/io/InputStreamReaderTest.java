package com.example.javase.io;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2023/9/12 15:41
 */
@SpringBootTest
public class InputStreamReaderTest {

    @Test
    public void inputStreamReaderTest() throws IOException {
        FileInputStream fis = new FileInputStream("./template/hello.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

        char[] buffer = new char[1024];
        int len;
        while ((len = isr.read(buffer)) != -1) {
            String content = new String(buffer, 0, len);
            System.out.println(content);
        }

        isr.close();
        fis.close();
    }
}
