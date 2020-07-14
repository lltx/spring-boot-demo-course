package com.pig4cloud.spring.demo17;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pig4cloud.spring.demo17.domain.SysUser;
import com.pig4cloud.spring.demo17.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDemo17ApplicationTests {
    @Autowired
    private SysUserMapper userMapper;

    @Test
    void contextLoads() {
        List<SysUser> sysUsers = userMapper.selectList(new QueryWrapper<>());

        System.out.println(sysUsers);
    }

    @Test
    void testQuery() {
        SysUser user = new SysUser();
        user.setUsername("leng");
        List<SysUser> sysUsers = userMapper.selectList(new QueryWrapper<>(user));

        System.out.println(sysUsers);
    }

    @Test
    void testQuery2() {
        List<SysUser> leng = userMapper.selectList(Wrappers
                .<SysUser>lambdaQuery().eq(SysUser::getUsername, "leng"));

        System.out.println(leng);
    }

    @Test
    void testQuery3() {
        IPage<SysUser> userIPage = new Page<>(1, 5);
        IPage<SysUser> page = userMapper.selectPage(userIPage, new QueryWrapper<>());

        System.out.println(page.getRecords());
        System.out.println(page.getTotal());

    }

    @Test
    void testQuery4(){

        List<SysUser> sysUsers = new SysUser().selectAll();

        System.out.println(sysUsers);
    }
}
