package com.assignment16.question7;

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
    
    void insertEntry(User user) {
        String sql = "insert into user values(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{user.getUname(), user.getPwd(), user.getName(), user.getAge(), user.getDob()});
        
    }
}
