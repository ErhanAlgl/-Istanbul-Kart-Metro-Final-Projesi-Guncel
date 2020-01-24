package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {
          try {
            String url = "jdbc:mysql://localhost:3306/istanbulkart";
            String uName = "root";
            String uPass = "a7121523S";
            Connection con = DriverManager.getConnection(url, uName, uPass);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
