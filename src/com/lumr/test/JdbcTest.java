package com.lumr.test;

import java.sql.*;
import java.util.Arrays;

/**
 * 测试数据库连接
 * Created by fsweb on 17-3-1.
 */
public class JdbcTest {
    public static void main(String[] args) {
        try{
            // 告诉java需要连接到哪个数据库
//            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/book_sc";
            String user = "lumr";
            String pw = "fslumr";
            Connection conn =  DriverManager.getConnection(url,user,pw);
            System.out.println("what the fuck?");
            Statement rste = conn.createStatement();
            ResultSet result = rste.executeQuery("select * from books");
            while (result.next()){
                System.out.println(result.getString(1)+"and"+result.getNString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
