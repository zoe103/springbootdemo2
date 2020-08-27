package com.msr.springgootdemo2.domain;

import java.util.Date;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.springgootdemo2.domain
 * @date 2020/8/26 15:38
 * @Copyright © 株式会社多言语系统研究所
 */
public class User {
    private int id;
    private String username;
    private Date bitrhday;
    private String sex;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBitrhday() {
        return bitrhday;
    }

    public void setBitrhday(Date bitrhday) {
        this.bitrhday = bitrhday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
