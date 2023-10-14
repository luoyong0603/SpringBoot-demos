package com.example.javase.io;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Date 2023-09-21 23:26
 */
@SpringBootTest
public class FileWriterTest {

    @Test
    public void test() throws IOException {
        FileWriter fileWriter = new FileWriter("./template/hello.txt");
        fileWriter.write("Hello, FileWriter!");
        fileWriter.flush();
        fileWriter.close();
    }

}
