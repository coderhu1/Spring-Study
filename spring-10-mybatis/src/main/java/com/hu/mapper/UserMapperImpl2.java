package com.hu.mapper;

import com.hu.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author coderhu1
 * @create 2020-10-07 17:27
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
