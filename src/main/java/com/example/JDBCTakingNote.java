package com.example;

import java.util.Date;

public class JDBCTakingNote {
    /*
    JDBC Driver
        Sự sử dụng của các kiểu driver
            Nếu bạn đang truy cập một kiểu cơ sở dữ liệu, chẳng hạn như Oracle, Sybase, hoặc IBM thì bạn nên dùng Thin driver.

            Nếu ứng dụng Java của bạn đang truy cập nhiều kiểu cơ sở dữ liệu cùng một thời điểm, thì bạn nên sử dụng Network Protocol driver.

            Nếu như 2 kiểu trên không có sẵn cho cơ sở dữ liệu, bạn nên sử dụng Native-API driver,
            Sử dụng mã native để tạo cầu nối giữa ứng dụng Java và cơ sở dữ liệu, Yêu cầu phải có thư viện native tương ứng với cơ sở dữ liệu.

       JDBC Driver chuyển đổi kiểu dữ liệu của Java thành kiểu dữ liệu của JDBC tương ứng trước khi gửi giá trị dữ liệu tới Database
       khi bạn gọi phương thức setXXX() của các đối tượng PreparedStatement hoặc CallableStatement hoặc phương thức ResultSet.updateXXX().
     */

    // ví dụ:
    public void sqlDate() {

        // date từ java sang jdbc
        Date javaDate = new Date();
        long javaTime = javaDate.getTime();

        java.sql.Date sqlDate = new java.sql.Date(javaTime);
    }

    /*
    xử lý null trong sql khác với trong java, có 3 cách:
        + tránh sử dụng getXXX() mà lấy trực tiếp kiểu dữ liệu về
        + Sử dụng các lớp Wrapper cho các kiểu dữ liệu gốc, và sử dụng phương thức wasNull() của đối tượng ResultSet để kiểm tra
        + Sử dụng kiểu dữ liệu gốc và phương thức wasNull() của đối tượng ResultSet để kiểm tra

        ví dụ:
            Statement stmt = conn.createStatement( );
            String sql = "SELECT mssv, ho, ten, diemthi FROM sinhvienk60";
            ResultSet rs = stmt.executeQuery(sql);

            int id = rs.getInt(1);
            if( rs.wasNull( ) ) {
               id = 0;
            }
    */


    /*
    Bước chung để kết nối jdbc tới 1 DB nào đó:
        Bước 1: Import các package cần thiết

        Bước 2: Đăng ký JDBC driver, JVM tải trình triển khai driver cụ thể vào trong bộ nhớ để nó có thể thực hiện các yêu cầu JDBC của bạn.
        Ví dụ:
            (Cho JDBC 4.0 trở đi, mới, nên dùng)
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            hoặc (nếu đang sử dụng một JDK không tuân theo JVM, cho JDBC 3.0 trở về trước, hơi cũ)
            Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver( myDriver );

        Bước 3: Tạo địa chỉ Database URL chính xác (Bước này rất quan trọng, cần chính xác)

        Bước 4: Tạo đối tượng Connection, gọi phương thức getConnection() của đối tượng DriverManager để thành lập kết nối tới cơ sở dữ liệu thực sự
     */
}
