package com.pig4cloud.spring.springbootdemo15;

import com.pig4cloud.spring.springbootdemo15.dao.SysUserDao;
import com.pig4cloud.spring.springbootdemo15.domain.SysUser;
import com.pig4cloud.spring.springbootdemo15.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDemo15ApplicationTests {

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysUserDao userDao;

    @Test
    void contextLoads() {
		System.out.println(userMapper.selectAll());
    }

    @Test
    void testInsert(){
        SysUser user = new SysUser();

        user.setUsername("2020年07月13日22:31:20");
        user.setPassword("2020年07月13日22:31:29");

        System.out.println(userMapper.saveSysUser(user));
        System.out.println(user.getUserId());
    }

    @Test
    void testSelect(){
        List<com.pig4cloud.spring.springbootdemo15.entity.SysUser> sysUsers = userDao.queryAll(new com.pig4cloud.spring.springbootdemo15.entity.SysUser());

        System.out.println(sysUsers);
    }

}
