package com.lumr.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 连接数据库专用
 * Created by fsweb on 17-3-2.
 */
public class ConnectDatabase {
    public static void main(String[] args) {
        ConnectDatabase test = new ConnectDatabase();
        test.connMysql(true);
    }

    /**
     * 连接Mysql
     * @param useSSL 是否使用ssl
     * @return 返回连接
     */
    public Connection connMysql(boolean useSSL) {
        String url = "jdbc:mysql://localhost:3306/java";
        String urlDefault = "?characterEncoding=utf8&useSSL=true";
        if (useSSL == true)
            url += urlDefault;
        String user = "webuser";
        String pwd = "wwwlumr";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("连接数据库成功");

        } catch (SQLException e) {
//          e.printStackTrace();
            System.out.println("不好意识,连接不上!");
        }
        return conn;
    }
}
