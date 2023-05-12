package com.angular.demo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
    public Connection getConnection() {

        Connection con = null;
        try {

            String connectPath = "jdbc:mysql://127.0.0.1:3306/common?autoReconnect=true";
            String username = "root";
            String password = "DaHaMPusH@1120";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    connectPath, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }


}
