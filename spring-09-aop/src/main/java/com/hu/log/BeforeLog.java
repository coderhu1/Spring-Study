package com.hu.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author coderhu1
 * @create 2020-10-06 20:41
 */
public class BeforeLog implements MethodBeforeAdvice {
    //method : 要执行的目标对象的方法
    // objects : 被调用的方法的参数
    // Object : 目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，" + target.getClass().getName() + "的方法");
    }
}
