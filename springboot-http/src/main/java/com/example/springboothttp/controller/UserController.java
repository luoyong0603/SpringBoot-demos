package com.example.springboothttp.controller;

import com.example.springboothttp.entity.UserEntity;
import com.example.springboothttp.model.QueryUser;
import com.example.springboothttp.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/4 17:08
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理模块", description = "用户管理模块")
public class UserController {

    @Autowired
    private UserService userService;

    //根据用户名和年龄查询
    @PostMapping("/queryUser-by-name-and-age")
    @ApiOperation(value = "根据用户名和年龄查询", notes = "根据用户名和年龄查询")
    public UserEntity queryUserByNameAndAge(@RequestBody QueryUser model) {
        return userService.queryUserByNameAndAge(model);
    }

    //根据id查询
    @GetMapping("/get-user-by-id")
    @ApiOperation(value = "根据id查询", notes = "根据id查询")
    public UserEntity getUserById(@RequestParam("id") Integer id) {
        return userService.getById(id);
    }


}
