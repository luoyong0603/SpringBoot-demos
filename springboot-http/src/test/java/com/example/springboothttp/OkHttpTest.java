package com.example.springboothttp;

import okhttp3.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * OkHttp测试用例
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/7 11:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OkHttpTest {

    @Test
    public void testGetRequest() throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        String url = "http://localhost:8082/user/get-user-by-id?id=1";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            Assert.assertEquals(200, response.code());

            ResponseBody responseBody = response.body();
            if (responseBody != null) {
                String result = responseBody.string();
                System.out.println(result);
                Assert.assertNotNull(result);
            }
        }
    }

    @Test
    public void testPostRequest() throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        String url = "http://localhost:8082/user/queryUser-by-name-and-age";

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"name\":\"bug菌\",\"age\": 18 }");

        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            Assert.assertEquals(200, response.code());

            ResponseBody responseBody = response.body();
            if (responseBody != null) {
                String result = responseBody.string();
                System.out.println(result);
                Assert.assertNotNull(result);
            }
        }

    }


}
