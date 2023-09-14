package com.example.javase;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileReader;
import java.io.IOException;

@SpringBootTest
public class JavaSeApplicationTests {

    @Test
    public void testFileReader(){
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

}
