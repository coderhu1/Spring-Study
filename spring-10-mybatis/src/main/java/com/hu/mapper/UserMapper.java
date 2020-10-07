package com.hu.mapper;

import com.hu.pojo.User;

import java.util.List;

/**
 * @author coderhu1
 * @create 2020-10-07 16:35
 */
public interface UserMapper {
    public List<User> selectUser();
}
