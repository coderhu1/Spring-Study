package com.hu.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author coderhu1
 * @create 2020-10-06 20:38
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue 返回值
    // method被调用的方法
    // args 被调用的方法的对象的参数
    // target 被调用的目标对象

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + target.getClass().getName() +"的"+method.getName()+"方法," +"返回值："+returnValue);
    }
}
