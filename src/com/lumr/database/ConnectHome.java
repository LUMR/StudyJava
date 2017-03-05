package com.lumr.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 家用数据库连接测试
 * Created by lumr on 2017/3/1.
 */
public class ConnectHome {
    public static void main(String[] args) {
        ConnectHome test = new ConnectHome();
        test.conn();
    }
    public Connection conn() {
        String url = "jdbc:mysql://192.168.1.107:3306/java";
        String urlDefault = "?characterEncoding=utf8&useSSL=true";
        String user = "webuser";
        String pwd = "wwwlumr";
        try {
            Connection conn = DriverManager.getConnection(url+urlDefault,user,pwd);
            System.out.println("连接成功。");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("不好意思，数据库连接不上！");
            return null;
        }
    }
}
