package com.example.javase.io.filterOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/**
 * @Author bug菌
 * @Date 2023-10-15 20:06
 */
public class FilterOutputStreamTest {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream("./template/hello.txt");
        for (int i = 0; i < 4 * 1024 * 1024; i++) {
            fos.write('a');
        }
        fos.close();
        long endTime = System.currentTimeMillis();
        System.out.println("FileOutputStream Time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        FileOutputStream fos2 = new FileOutputStream("./template/hello.txt");
        FilterOutputStream fosFilter = new FilterOutputStream(fos2);
        for (int i = 0; i < 4 * 1024 * 1024; i++) {
            fosFilter.write('a');
        }
        fosFilter.flush();
        fosFilter.close();
        endTime = System.currentTimeMillis();
        System.out.println("FilterOutputStream Time: " + (endTime - startTime) + " ms");
    }


}
