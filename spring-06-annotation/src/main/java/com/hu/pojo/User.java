package com.hu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author coderhu1
 * @create 2020-10-06 10:35
 */

@Component("user")
@Scope("prototype")
public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("huzong")
    public void setName(String name) {
        this.name = name;
    }
}
