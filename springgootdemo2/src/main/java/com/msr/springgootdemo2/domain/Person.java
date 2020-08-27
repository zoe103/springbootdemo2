package com.msr.springgootdemo2.domain;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.springgootdemo2.domain
 * @date 2020/8/26 14:56
 * @Copyright © 株式会社多言语系统研究所
 */
public class Person {
    private String name;
    private int age;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
