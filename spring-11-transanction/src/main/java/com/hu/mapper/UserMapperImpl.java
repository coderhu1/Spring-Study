package com.hu.mapper;

import com.hu.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author coderhu1
 * @create 2020-10-07 17:27
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {
        User user = new User("huzong3", 4, "sga;sgh");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.insertUser(user);
        mapper.deleteUser(4);

        return mapper.selectUser();
    }

    public int insertUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).insertUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
