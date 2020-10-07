package com.hu.config;

/**
 * @author coderhu1
 * @create 2020-10-06 20:59
 */
public class DiyPointCut {
    public void before() {
        System.out.println("-------执行前------");
    }

    public void after() {
        System.out.println("-------执行后------");
    }
}
