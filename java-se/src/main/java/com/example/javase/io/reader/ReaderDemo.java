package com.example.javase.io.reader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/19 11:24
 */
public class ReaderDemo {

    //1. 读取文本文件
    public static void testReadFile(){
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("./template/fileTest.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //2. 读取网络资源
    public static void testReadURL() throws IOException {
        URL url = new URL("https://www.baidu.com/");
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        isr.close();
        is.close();
    }

    //3. 读取字符串
    public static void testReadStr() throws IOException {
        String str = "Hello, World!!!";
        StringReader stringReader = new StringReader(str);
        int data;
        while ((data = stringReader.read()) != -1) {
            System.out.print((char) data);
        }
        stringReader.close();
    }

    public static void main(String[] args) throws IOException {
        testReadStr();
    }


}
