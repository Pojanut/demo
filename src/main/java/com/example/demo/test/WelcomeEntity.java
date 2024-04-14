package com.example.demo.test;

public class WelcomeEntity {
    public WelcomeEntity(String hello) {
        this.msg = hello;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

}
