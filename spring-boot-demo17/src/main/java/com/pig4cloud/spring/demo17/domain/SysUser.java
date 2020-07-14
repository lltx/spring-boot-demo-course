package com.pig4cloud.spring.demo17.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @author lengleng
 * @date 2020/7/14
 */
@Data
public class SysUser extends Model<SysUser> {

    private Integer userId;

    private String username;

    private String password;
}
