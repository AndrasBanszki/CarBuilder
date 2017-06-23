
package com.carbuilder.china.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Car Builder Web Application
 * @author Bánszki András <andras.banszki@gmail.com>
 */

public class MySqlConnector {
    
    //Constant strings
    private static final String URL = "jdbc:mysql://localhost:3306/home?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";

    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}