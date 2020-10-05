package com.hu.service;

import com.hu.dao.UserDao;
import com.hu.dao.UserDaoImpl;
import com.hu.dao.UserDaoMysqlImpl;
import com.hu.dao.UserDaoOracleImpl;

/**
 * @author coderhu1
 * @create 2020-10-05 15:45
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //set实现注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
