package com.assignment16.question10;

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
    
    User getUser(){
        String sql = "select * from user where username=?";
      return jdbcTemplate.queryForObject(sql, new Object[]{"dharmendra"},new UserMapper());
    }
}
