package com.example.javase.io.fileProject;

import java.io.*;

import static org.springframework.util.FileCopyUtils.BUFFER_SIZE;

/**
 * @author 喵手
 * @version 1.0
 * @date 2023/10/20 17:35
 */
public class BufferedOutputStreamTest {

    //处理文件读写
    public static void test_1() throws IOException {
            String content = "Hello, BufferedOutputStream!";
            byte[] bytes = content.getBytes();

            File file = new File("testDoc.txt");

            OutputStream outputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();

            bufferedOutputStream.close();

            InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] readBytes = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(readBytes)) != -1) {
                System.out.println(new String(readBytes, 0, len));
            }

            bufferedInputStream.close();
    }

    public static void test_2() throws IOException {
        File file = new File("testDoc.txt");
        OutputStream outputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, BUFFER_SIZE);

        String content = "Hello, BufferedOutputStream!";
        byte[] bytes = content.getBytes();

        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        InputStream inputStream = new FileInputStream(file);
        byte[] readBytes = new byte[BUFFER_SIZE];
        int len = inputStream.read(readBytes);
        System.out.println("len:"+len);
    }


    public static void main(String[] args) throws IOException {
        test_2();
    }
}
