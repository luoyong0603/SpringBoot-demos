package com.example.javase.io.reader.inputStreamReader;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 15:09
 */
public class InputStreamReaderDemo {

    //读取网络资源
    public static void testReadURL() throws IOException {
        URL url = new URL("http://www.baidu.com");
        URLConnection conn = url.openConnection();
        InputStream in = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        isr.close();
        in.close();
    }

    //读取本地文件
    public static void testReadFile() throws IOException {
        FileInputStream fis = new FileInputStream("./template/fileTest.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        isr.close();
        fis.close();
    }

    public static void main(String[] args) throws IOException {
        testReadURL();
    }
}
