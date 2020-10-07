package com.hu.demo02;

/**
 * @author coderhu1
 * @create 2020-10-06 19:05
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public UserServiceProxy() {
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String arg) {
        System.out.println("执行了" + arg + "方法");
    }
}
