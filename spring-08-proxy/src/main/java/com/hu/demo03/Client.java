package com.hu.demo03;

/**
 * @author coderhu1
 * @create 2020-10-06 20:01
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //将真实角色放置进去！
        pih.setRent(host);
        //动态生成对应的代理类！
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
