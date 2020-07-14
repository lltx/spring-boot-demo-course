package com.pig4cloud.spring.springbootdemo16.mapper;

import com.pig4cloud.spring.springbootdemo16.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author lengleng
 * @date 2020/7/14
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
