package com.assignment16.question10;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setAge(rs.getInt("age"));
        user.setDob(rs.getString("dob"));
        user.setName(rs.getString("name"));
        user.setPwd(rs.getString("password"));
        user.setUname(rs.getString("username"));
        
        return user;
    }
}
