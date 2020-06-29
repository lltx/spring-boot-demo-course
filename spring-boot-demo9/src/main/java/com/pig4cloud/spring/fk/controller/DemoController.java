package com.pig4cloud.spring.fk.controller;

import com.pig4cloud.spring.fk.vo.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lengleng
 * @date 2020/6/28
 */
@Controller
public class DemoController {

    @GetMapping
    public ModelAndView demo(HttpServletRequest request, String username) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        modelAndView.addObject("k1", "v1");
        modelAndView.addObject("user", new SysUser("lengleng"));


        List<SysUser> userList = new ArrayList<>();
        userList.add(new SysUser("aaaa"));
        userList.add(new SysUser("bbbb"));
        userList.add(new SysUser("cccc"));
        userList.add(new SysUser("dddd"));
        modelAndView.addObject("userList", userList);


        modelAndView.addObject("date", new Date());

        request.setAttribute("req", "val");
        request.getSession().setAttribute("sess", "sess");
        return modelAndView;
    }
}
