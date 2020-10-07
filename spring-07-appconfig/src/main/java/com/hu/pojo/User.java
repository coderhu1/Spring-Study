package com.hu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author coderhu1
 * @create 2020-10-06 11:03
 */
@Component
//将这个类标注为Spring的一个组件，放到容器中！
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
