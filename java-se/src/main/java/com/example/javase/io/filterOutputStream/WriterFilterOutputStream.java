package com.example.javase.io.filterOutputStream;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/**
 * @Author bug菌
 * @Date 2023-10-15 20:17
 */
public class WriterFilterOutputStream {

    public static void main(String[] args) throws IOException {
        String s = "Hello, world!jym!!!";
        FileOutputStream fos = new FileOutputStream("./template/hello.txt");
        FilterOutputStream fosFilter = new FilterOutputStream(fos);
        byte[] bytes = s.getBytes();
        fosFilter.write(bytes);
        fosFilter.flush();
        fosFilter.close();
    }
}
