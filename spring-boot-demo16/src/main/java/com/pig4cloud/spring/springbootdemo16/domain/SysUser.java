package com.pig4cloud.spring.springbootdemo16.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;

/**
 * @author lengleng
 * @date 2020/7/14
 */
@Data
public class SysUser {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer userId;

    private String username;

    private String password;
}
