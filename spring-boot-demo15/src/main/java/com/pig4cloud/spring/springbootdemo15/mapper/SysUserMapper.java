package com.pig4cloud.spring.springbootdemo15.mapper;

import com.pig4cloud.spring.springbootdemo15.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lengleng
 * @date 2020/7/13
 */
@Mapper
public interface SysUserMapper {

    List<SysUser> selectAll();


    Integer saveSysUser(@Param("user") SysUser user);

}
