package com.example.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/13 14:48
 */
public class InputStreamTest {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            //1.创建InputStream对象
            inputStream = new FileInputStream("./template/hello.txt");
            //2.读取数据
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(buf)) > 0) {
                String str = new String(buf, 0, len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭文件流
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
