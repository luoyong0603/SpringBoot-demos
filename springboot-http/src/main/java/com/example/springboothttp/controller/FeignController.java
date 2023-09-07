package com.example.springboothttp.controller;

import com.example.springboothttp.comment.feign.FeignUserClient;
import com.example.springboothttp.entity.UserEntity;
import com.example.springboothttp.model.QueryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/6 18:20
 */
@RestController
public class FeignController {

    @Autowired
    private FeignUserClient gitHubClient;

    @PostMapping("/userinfo")
    public UserEntity getUserInfo(@RequestBody QueryUser model) {
        return gitHubClient.queryUserByNameAndAge(model);
    }

}