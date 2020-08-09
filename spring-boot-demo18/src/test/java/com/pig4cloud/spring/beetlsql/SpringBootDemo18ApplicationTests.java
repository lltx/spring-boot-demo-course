package com.pig4cloud.spring.beetlsql;

import com.pig4cloud.spring.beetlsql.dao.SysUserDao;
import com.pig4cloud.spring.beetlsql.domain.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDemo18ApplicationTests {

	@Autowired
	private SysUserDao userDao;


	@Test
	void contextLoads() {
		System.out.println(userDao.all());
	}

	@Test
	void testSave(){
		SysUser user = new SysUser();
		user.setUsername("beetlsql");
		user.setPassword("123456");
		userDao.insert(user);
	}

	@Test
	void testQuery(){
		List<SysUser> lengList = userDao.selectByUsername("leng");

		System.out.println(lengList);
	}

	@Test
	void testQuery2(){
		System.out.println(userDao.createLambdaQuery().page(1, 5));
	}
}
