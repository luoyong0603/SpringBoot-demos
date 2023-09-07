package com.example.springboothttp.comment.feign;

import com.example.springboothttp.entity.UserEntity;
import com.example.springboothttp.model.QueryUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/6 17:52
 */
@FeignClient(name = "user", url = "http://127.0.0.1:8082/user")
public interface FeignUserClient {

    //自提供http请求，供Feign调用测试。
    @PostMapping("/queryUser-by-name-and-age")
    UserEntity queryUserByNameAndAge(@RequestBody QueryUser model);

}

