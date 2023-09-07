package com.example.springboothttp;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * HttpClient测试用例
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/7 15:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpClientTest {

    //get请求
    @Test
    public void testGetRequest() {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet("http://localhost:8082/user/get-user-by-id?id=1");
        try {
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                String result = EntityUtils.toString(entity);
                System.out.println(result);
                Assert.assertNotNull(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //post请求
    @Test
    public void testPostRequest() {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        //模拟一个post请求
        HttpPost httpPost = new HttpPost("http://localhost:8082/user/queryUser-by-name-and-age");
        httpPost.setHeader("Content-Type", "application/json");
        String requestBody = "{ \"name\": \"bug菌\", \"age\": 18 }";
        StringEntity entity = new StringEntity(requestBody, "UTF-8");
        httpPost.setEntity(entity);
        try {
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();

            if (httpEntity != null) {
                String result = EntityUtils.toString(httpEntity);
                System.out.println(result);
                Assert.assertNotNull(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
