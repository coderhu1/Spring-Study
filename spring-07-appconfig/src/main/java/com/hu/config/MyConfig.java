package com.hu.config;

import com.hu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author coderhu1
 * @create 2020-10-06 11:03
 */
@Configuration
//代表这是一个配置类
@ComponentScan("com.hu.pojo")
//扫描器扫描的是类上的注解，不是类内部的
@Import(MyConfig2.class)
public class MyConfig {

    //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    @Bean
    public User user() {
        return new User();
    }

    //这里写@Bean相当于xml配置文件中的bean标签
    //如果已经在User类使用了@Component注解，可以在配置类中使用@ComponentScan注解让spring知道Bean在哪
    //配置类不写@Bean相当于xml配置中不写bean标签

    //既写@Bean也在类上写@Component不影响，spring能找到bean就行
}
