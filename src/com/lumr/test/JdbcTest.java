package com.lumr.test;

import com.lumr.database.ConnectDatabase;
import java.sql.*;
import java.util.Scanner;


/**
 * 测试数据库连接
 * Created by fsweb on 17-3-1.
 */
public class JdbcTest {
    ConnectDatabase com = new ConnectDatabase();
    private Connection conn = com.connMysql(true);
    private PreparedStatement pre = null;
    private Statement rs = null;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        JdbcTest test = new JdbcTest();
        System.out.println("请输入要添加的书名:");
        String name = input.next();
        System.out.println("请输入书的作者:");
        String author = input.next();
        System.out.println("请输入书的描述:");
        String desc = input.next();
        test.save(name,author,desc);
        test.update();
        System.out.println("请输入要删除的id");
        int id = input.nextInt();
        test.delete(id);
        System.out.println("请输入要删除的name");
        name = input.next();
        test.delete(name);
        System.out.println("请输入要添加的列名:");
        String colName = input.next();
        test.alter(colName);
        test.queryAll();
        test.close();
    }

    public void save(String name,String author,String desc){
        String sql = "insert into arrayslist(name,author,description) values (?,?,?)";
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1,name);
            pre.setString(2,author);
            pre.setString(3,desc);
            if(pre.executeUpdate()>0)
                System.out.println("插入成功");
            else
                System.out.println("插入失败");
        } catch (SQLException e) {
//            e.printStackTrace();
            System.out.println("执行失败");
        }
    }

    public void delete(int id){
        String sql = "delete from arrayslist where id = "+id;
        if (this.query(sql)>0)
            System.out.println("删除成功");
        else
            System.out.println("删除失败");
    }

    public void delete(String name){
        String sql = "delete from arrayslist where name = '"+name+"'";
        if (this.query(sql)>0)
            System.out.println("删除成功");
        else
            System.out.println("删除失败");
    }

    public void update(){
        String sql = "update arrayslist set name = '尼尔' where id = 1";
        if(this.query(sql)>0)
            System.out.println("更新成功");
        else
            System.out.println("更新失败");
    }

    public void alter(String colName){
        String sql = "alter table arrayslist add "+colName+" varchar(20) default 'nothing'";
        try {
            pre = conn.prepareStatement(sql);
//            pre.setString(1,colName);
            if (pre.executeUpdate()>0)
                System.out.println("添加列成功");
            else
                System.out.println("添加列失败");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private int query(String sql) {
        try {
            pre = conn.prepareStatement(sql);
            return pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("执行失败");
            return 0;
        }

    }

    /**
     * 获得所有结果
     */
    public void queryAll(){
        String sql = "select * from arrayslist";
        try {
            rs = conn.createStatement();
            ResultSet result = rs.executeQuery(sql);
            while (result.next()){
                for (int i = 1; i <= 4; i++) {
                    System.out.printf(result.getString(i)+"\t");
                }
                System.out.printf("\n");
            }
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            pre.close();
            rs.close();
            conn.close();
            System.out.println("执行结束,数据库关闭.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
