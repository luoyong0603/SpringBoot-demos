package com.example.javase.collection;

import java.io.*;
import java.util.Properties;

/**
 * @author ms
 * @date 2023/10/26 18:19
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        // 读取配置文件
        InputStream in = new FileInputStream("config/config.properties");
        prop.load(in);
        in.close();

        // 获取配置信息
        String url = prop.getProperty("db.url");
        String username = prop.getProperty("db.username");
        String password = prop.getProperty("db.password");
        System.out.println("db.url = " + url);
        System.out.println("db.username = " + username);
        System.out.println("db.password = " + password);

        // 修改配置信息
        prop.setProperty("db.password", "654321");
        OutputStream out = new FileOutputStream("config/config.properties");
        prop.store(out, null);
        System.out.println("修改后的db.password = " + prop.getProperty("db.password"));
        out.close();
    }
}
