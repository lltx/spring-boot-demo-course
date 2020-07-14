package com.pig4cloud.spring.springbootdemo16;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pig4cloud.spring.springbootdemo16.domain.SysUser;
import com.pig4cloud.spring.springbootdemo16.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDemo16ApplicationTests {

    @Autowired
    private SysUserMapper userMapper;

    @Test
    void contextLoads() {

        System.out.println(userMapper.selectAll());
    }

    @Test
    void testInsert() {
        SysUser user = new SysUser();
        user.setUsername("2020年07月14日00:28:44");
        user.setPassword("2020年07月14日00:28:51");

        System.out.println(userMapper.insert(user));
        System.out.println(user.getUserId());
    }

    @Test
    void testQuery() {
        SysUser condition = new SysUser();
        condition.setUsername("leng");
        List<SysUser> select = userMapper.select(condition);

        System.out.println(select);
    }

    @Test
    void testPage() {

        PageHelper.startPage(2, 5);
		List<SysUser> sysUsers = userMapper.selectAll();


		PageInfo<SysUser> pageInfo = new PageInfo<>(sysUsers);

		System.out.println(pageInfo);
    }
}
