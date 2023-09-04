package com.example.springboothttp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboothttp.entity.UserEntity;
import com.example.springboothttp.model.QueryUser;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/4 17:09
 */
public interface UserService extends IService<UserEntity> {


    UserEntity queryUserByNameAndAge(QueryUser model);

}
