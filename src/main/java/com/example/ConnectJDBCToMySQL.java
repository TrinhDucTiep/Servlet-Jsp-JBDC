package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// nhớ thêm thư viện mysql-connector vào external libraries (file > project structure > dependencies > add +)
public class ConnectJDBCToMySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/hello";
    private static final String USER = "root";
    private static final String PASSWORD = "manacoto123";

    public static Connection getJDBCConnection() {
        try {
//            Class.forName("com.mysql.jdbc.Driver"); // đã bị deprecated, không cần tải driver này bằng tay nữa, nó sẽ tự động tải com.mysql.cj.jdbc.Driver
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        Connection connection = getJDBCConnection();

        if(connection != null) {
            System.out.println("Kết nối đến database thành công");
        } else {
            System.out.println("Kết nối đến database thất bại");
        }
    }
}
