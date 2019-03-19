package com.assignment16.question12and13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
public class UserDAO3 {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    //add different propagation to check
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = RuntimeException.class)
    void query3(){
        String sql = "insert into user values ('xyzaaaaaaaa','test','xyzaaaaaa',12,'2001-12-2')";
        jdbcTemplate.update(sql);
        throw new RuntimeException();
    }
}
