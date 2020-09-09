package com.yy.cloud.common.entities;

/**
 * @Author : mmy
 * @Creat Time : 2020/8/29  下午 7:32
 * @Description
 */
public class Payment {

    private Integer id;
    private String serial;


    public Payment(Integer id, String serial) {
        this.id = id;
        this.serial = serial;
    }


    public Payment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
