package com.hu.demo01;

/**
 * @author coderhu1
 * @create 2020-10-06 18:20
 */
public class Client{
    public static void main(String[] args) {
        //找房东
        Host host = new Host();
        //找代理
        Proxy proxy = new Proxy(host);
        //代理租房
        proxy.rent();
    }
}
