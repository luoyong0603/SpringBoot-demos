package com.example.springboothttp.controller;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/4 16:51
 */
public class HttpClientController {

//    public static void main(String[] args) {
//        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
//        HttpGet httpGet = new HttpGet("http://www.baidu.com");
//        try {
//            HttpResponse response = httpClient.execute(httpGet);
//            System.out.println(EntityUtils.toString(response.getEntity()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @GetMapping("/{id}")
    public String get(@PathVariable("id") Long id) {
        return "hello,world!";
    }


    //post请求
    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        //模拟一个post请求
        HttpPost httpPost = new HttpPost("http://localhost:8082/user/queryUser-by-name-and-age");
        httpPost.setHeader("Content-Type", "application/json");
        String requestBody = "{ \"name\": \"bug菌\", \"age\": 18 }";
        StringEntity entity = new StringEntity(requestBody, "UTF-8");
        httpPost.setEntity(entity);
        try {
            HttpResponse response = httpClient.execute(httpPost);
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
