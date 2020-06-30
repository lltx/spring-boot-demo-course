package com.pig4cloud.spring.jt.service;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author lengleng
 * @date 2020/6/29
 */
@Service
@AllArgsConstructor
public class UserService {
    private final JdbcTemplate jdbcTemplate;


    public void insert(String username, String password) {
        jdbcTemplate.update("insert into user(username,password) values (?,?)", username, password);
    }

    public void delete(Integer id) {
        jdbcTemplate.update("delete from user where id = ?", id);
    }

    public void update(Integer id, String password) {
        jdbcTemplate.update("update user set password = ? where id = ?", password, id);
    }

    public Map<String, Object> query(Integer id){
        return jdbcTemplate.queryForMap("select * from user where id = ?",id);
    }
}
