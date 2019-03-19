package com.assignment16.question2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class UserDAO {
    
    @Autowired
    DataSource dataSource;
    
    void insertData() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user values('dharmendra','ttn','dharmendra',20, '1990-2-12')");
        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into user values('ankit','ttn','ankit',21, '1990-3-11')");
        PreparedStatement preparedStatement2 = connection.prepareStatement("insert into user values('lalit','ttn','lalit',20, '1990-4-12')");
        PreparedStatement preparedStatement3 = connection.prepareStatement("insert into user values('nitin','ttn','nitin',20, '1990-2-19')");
        PreparedStatement preparedStatement4 = connection.prepareStatement("insert into user values('sheetal','ttn','sheetal',19, '1990-2-3')");
        preparedStatement.execute();
        preparedStatement1.execute();
        preparedStatement2.execute();
        preparedStatement3.execute();
        preparedStatement4.execute();
    }
    
}
