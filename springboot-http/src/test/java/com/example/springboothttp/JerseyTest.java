package com.example.springboothttp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Jersey测试用例
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/7 16:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JerseyTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testSayHello() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/hello", String.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo("Hello World!");
    }

}
