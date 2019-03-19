package com.assignment16.question6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDAO {
    
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void getName(String uname) {
        String sql = "SELECT name from user where username=? ";
        System.out.println(jdbcTemplate.queryForObject(sql,new Object[]{uname}, String.class));
    }
}
