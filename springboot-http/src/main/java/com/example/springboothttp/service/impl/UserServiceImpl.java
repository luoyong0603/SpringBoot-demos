package com.example.springboothttp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboothttp.dao.UserMapper;
import com.example.springboothttp.entity.UserEntity;
import com.example.springboothttp.model.QueryUser;
import com.example.springboothttp.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Objects;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/4 17:12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {


    @Override
    public UserEntity queryUserByNameAndAge(QueryUser model) {

        LambdaQueryWrapper<UserEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(StringUtils.isNotEmpty(model.getName()), UserEntity::getName, model.getName())
                .eq(Objects.nonNull(model.getAge()), UserEntity::getAge, model.getAge());

        return this.getOne(queryWrapper);
    }
}
