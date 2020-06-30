package com.pig4cloud.spring.jpa.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lengleng
 * @date 2020/6/30
 */
@Entity
@Data
@Table(name = "user")
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;
}
