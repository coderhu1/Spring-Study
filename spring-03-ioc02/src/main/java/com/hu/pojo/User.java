package com.hu.pojo;

/**
 * @author coderhu1
 * @create 2020-10-05 18:18
 */
public class User {
    private String name;

    public User() {
        System.out.println("User被创建");
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
