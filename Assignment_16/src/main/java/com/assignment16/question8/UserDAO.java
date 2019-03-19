package com.assignment16.question8;

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
    
    void queryForMap(){
        String sql = "select * from user where username=?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{"abc"}));
    }
}
