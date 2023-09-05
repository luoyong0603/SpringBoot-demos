package com.example.springboothttp;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/4 16:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestRestTemplateTest {

    @Test
    public void testGet() {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet("http://localhost:8082/user/1");
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println(responseBody);
            assertNotNull(responseBody);
            assertThat(responseBody, containsString("hello,world!"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
