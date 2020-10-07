package com.hu.demo02;

/**
 * @author coderhu1
 * @create 2020-10-06 19:08
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy userServiceProxy = new UserServiceProxy();

        userServiceProxy.setUserService(userService);

        userServiceProxy.add();
    }
}
