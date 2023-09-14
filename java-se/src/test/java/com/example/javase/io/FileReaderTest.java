package com.example.javase.io;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileReader;
import java.io.IOException;

/**
 * @date 2023/9/12 15:57
 */
@SpringBootTest
public class FileReaderTest {

    private FileReader reader;

    @Before
    public void setUp() throws Exception {
        reader = new FileReader("./template/hello.txt");
    }

    @After
    public void tearDown() throws Exception {
        if (reader != null) {
            reader.close();
        }
    }

    @Test
    public void testRead() throws IOException {
        int data = reader.read();
        Assert.assertEquals(data, 104);
    }

    @Test
    public void testReadCharArray() throws IOException {
        char[] cbuf = new char[4];
        int len = reader.read(cbuf);
        Assert.assertEquals(len, 4);   //cbuf:[h,e,l,l]
        Assert.assertEquals(cbuf[0], 'h');
    }

    @Test
    public void testReadCharArrayOffLen() throws IOException {
        char[] cbuf = new char[4];
        int len = reader.read(cbuf, 1, 2);  //cbuf:[,h,e,]
        Assert.assertEquals(len, 2);
        Assert.assertEquals(cbuf[1], 'h');
    }


}

