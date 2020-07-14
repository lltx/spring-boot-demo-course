package com.pig4cloud.spring.demo17.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pig4cloud.spring.demo17.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lengleng
 * @date 2020/7/14
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
