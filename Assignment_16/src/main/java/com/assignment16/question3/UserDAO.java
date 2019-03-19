package com.assignment16.question3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserDAO {
    
    @Autowired
    DataSource dataSource;
    
    void printData() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
        {
            System.out.println("UserName: "+resultSet.getString("username"));
            System.out.println("Password: "+resultSet.getString("password"));
            System.out.println("Name: "+resultSet.getString("name"));
            System.out.println("Age :"+resultSet.getInt("age"));
            System.out.println("DOB :"+resultSet.getString("dob"));
        }
    }
}
