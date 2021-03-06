package com.example.demo.vo;

import com.example.demo.entity.User;

import java.io.Serializable;
/**
 *
 * @author 咲蛍
 * @date 2021/05/27
 */
public class LoginVO implements Serializable {
    private String token;
    private transient User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LoginVO{" +
                "token='" + token + '\'' +
                ", user=" + user +
                '}';
    }
}
