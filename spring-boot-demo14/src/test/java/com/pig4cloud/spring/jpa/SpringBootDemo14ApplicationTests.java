package com.pig4cloud.spring.jpa;

import com.pig4cloud.spring.jpa.dao.SysUserDao;
import com.pig4cloud.spring.jpa.domain.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SpringBootDemo14ApplicationTests {

    @Autowired
    private SysUserDao userDao;

    @Test
    void contextLoads() {
        SysUser user = new SysUser();
        user.setUsername("lengleng");
        user.setPassword("paaaxc");

        userDao.save(user);
    }

    @Test
    void testDel() {
        SysUser user = new SysUser();
        user.setId(1);
        userDao.delete(user);
    }

    @Test
    void  testUpd(){
        Optional<SysUser> optional = userDao.findById(1);
        SysUser sysUser = optional.get();

        sysUser.setPassword("newpwd");
        userDao.save(sysUser);
    }

    @Test
    void testQuery(){
//        Iterable<SysUser> all = userDao.findAll();
//        System.out.println(all);

        SysUser byUsername = userDao.findByUsername("1231");

        System.out.println(byUsername);
    }
}
