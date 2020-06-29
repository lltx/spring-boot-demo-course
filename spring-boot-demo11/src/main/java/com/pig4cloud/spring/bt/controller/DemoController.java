package com.pig4cloud.spring.bt.controller;

import com.pig4cloud.spring.bt.vo.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lengleng
 * @date 2020/6/29
 */
@Controller
public class DemoController {

    @GetMapping
    public ModelAndView demo() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("username", "llllleng");

        SysUser user1 = new SysUser(1, "aaa");
        SysUser user2 = new SysUser(2, "bbb");
        SysUser user3 = new SysUser(3, "ccc");
        SysUser user4 = new SysUser(4, "ddd");

        List<SysUser> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        modelAndView.addObject("userList", userList);

        modelAndView.addObject("date",new Date());
        modelAndView.setViewName("index.btl");
        return modelAndView;
    }
}
