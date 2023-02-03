package org.example.Day35PracticePrablem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection() {
        Connection root = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connected");
            root = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeee", "root", "Pass@123");
            System.out.println("Ready to Boom ............");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return root;
    }
}
