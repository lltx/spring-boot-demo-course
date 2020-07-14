package com.pig4cloud.spring.springbootdemo15.entity;

import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2020-07-13 22:35:58
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 604028956254506996L;
    
    private Integer userId;
    
    private String username;
    
    private String password;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}