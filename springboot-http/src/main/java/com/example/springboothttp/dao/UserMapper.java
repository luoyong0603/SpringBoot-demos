package com.example.springboothttp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboothttp.entity.UserEntity;
import org.springframework.stereotype.Component;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/4 17:16
 */
@Component
public interface UserMapper extends BaseMapper<UserEntity> {
}
