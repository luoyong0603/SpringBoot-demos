package com.example.springboothttp.controller;

import io.swagger.annotations.Api;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@Api(tags = "RestTemplateTest模块", description = "RestTemplateTest模块")
public class RestTemplateTestController {

    /**
     * 模拟接口给http调用
     */
    @GetMapping("/{id}")
    public String get(@PathVariable("id") Long id) {
        return "hello,world!";
    }


    //直接测试百度url
    public static void main(String[] args) throws Exception {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        String responseBody = restTemplateBuilder.build()
                .getForObject("https://www.baidu.com/", String.class);
        System.out.println(responseBody);
    }

}