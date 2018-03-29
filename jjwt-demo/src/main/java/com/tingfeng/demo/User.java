package com.tingfeng.demo;

public class User {

    private String nickname;
    private String wechat;
    private String qq;

    public User() {
    }

    public User(String nickname, String wechat, String qq) {
        this.nickname = nickname;
        this.wechat = wechat;
        this.qq = qq;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}
