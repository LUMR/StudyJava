package com.lumr.test;

import com.lumr.database.ConnectDatabase;
import com.lumr.database.ConnectHome;

import java.sql.*;
import java.util.Scanner;

/**
 * 数据库的增删改查
 * Created by fsweb on 17-3-3.
 */
public class DatabaseManger {
    private Scanner input = new Scanner(System.in);
    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet result;

    public static void main(String[] args) {
        DatabaseManger test = new DatabaseManger();
        test.connect();
        do {
            test.menu();
        }while (true);

    }

    /**
     * 显示选择界面
     */
    public void menu(){
        System.out.println("请选择要进行的操作:1.增加 2.删除 3.修改 4.查询 5.显示所有数据 6.退出");
        int num = input.nextInt();
        String name;
        int id;
        switch (num){
            case 1:
                //增加
                System.out.println("请输入要增加的ID:");
                id = input.nextInt();
                System.out.println("请输入要增加的名字:");
                name = input.next();
                this.add(id,name);
                break;
            case 2:
                //删除
                System.out.println("请输入要删除的名字:");
                name = input.next();
                this.delete(name);
                break;
            case 3:
                //修改
                System.out.println("请输入要增加的列名");
                name = input.next();
                this.alter(name);
                break;
            case 4:
                //查询
                System.out.println("请输入要查询的名字:");
                name = input.next();
                this.select(name);
                break;
            case 5:
                this.showAll();
                break;
            case 6:
                //退出
                this.close();
                System.exit(0);
        }
    }
    //数据库表名test
    //表格式:id int primary key auto_increment
    //      name varchar(20)
    /**
     * 插入数据
     * @param id
     * @param name
     */
    public void add(int id,String name){

    }

    /**
     * 删除数据
     * @param name
     */
    public void delete(String name){

    }

    /**
     * 增加一个列
     * @param colname 列名
     */
    public void alter(String colname){

    }

    /**
     * 查询
     * @param name 要查询的名字
     */
    public void select(String name){

    }

    /**
     * 连接数据库的方法
     */
    public void connect(){
        //连接本机上的数据库时采用此类
        ConnectDatabase com = new ConnectDatabase();
        //连接别的机器的数据库时用此类
        ConnectHome home = new ConnectHome();
        conn = com.connMysql(true);
        if (conn == null)
            conn = home.conn();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 显示test表中的所有数据
     */
    public void showAll(){
        String sql = "select * from test";
        try {
            result = stmt.executeQuery(sql);
            while (result.next()){
                for (int i = 1; i < 3; i++) {
                    System.out.printf(result.getString(i)+"\t");
                }
                System.out.printf("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    /**
     * 关闭资源
     */
    public void close(){

        try {
            if (result != null) {
                result.close();
                System.out.println("result关闭成功");
            }
            if (pstmt != null) {
                pstmt.close();
                System.out.println("pstmt关闭成功");
            }
            if (stmt != null) {
                stmt.close();
                System.out.println("stmt关闭成功");
            }
            if (conn != null) {
                conn.close();
                System.out.println("conn关闭成功");
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
    }
}
