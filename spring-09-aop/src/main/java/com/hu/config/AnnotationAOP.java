package com.hu.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author coderhu1
 * @create 2020-10-06 21:24
 */
@Aspect
public class AnnotationAOP {

    @Before("execution(* com.hu.service.*.*(..))")
    public void before() {
        System.out.println("=======before=======");
    }

    @After("execution(* com.hu.service.*.*(..))")
    public void after() {
        System.out.println("=======after=======");
    }

    @Around("execution(* com.hu.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
