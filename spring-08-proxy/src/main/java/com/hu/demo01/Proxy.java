package com.hu.demo01;

/**
 * @author coderhu1
 * @create 2020-10-06 18:21
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        seeHouse();
        host.rent();
        contract();
    }

    public void seeHouse() {
        System.out.println("带客户看房");
    }

    public void contract() {
        System.out.println("和客户签合同");
    }
}
