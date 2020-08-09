package com.pig4cloud.spring.beetlsql.dao;

import com.pig4cloud.spring.beetlsql.domain.SysUser;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lengleng
 * @date 2020/7/14
 */
@Component
public interface SysUserDao extends BaseMapper<SysUser> {

    List<SysUser> selectByUsername(String username);
}
