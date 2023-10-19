package com.example.javase.io.fileProject;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

/**
 * @Author 喵手
 * @Date 2023-10-20 0:02
 */
public class FilterInputStreamTest {

    public static void main(String[] args) throws Exception {
        FileInputStream in = null;
        FilterInputStream fin = null;
        try {
            in = new FileInputStream("testDoc.txt");
            fin = new BufferedInputStream(in);
            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char)c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fin != null) {
                fin.close();
            }
        }
    }
}
