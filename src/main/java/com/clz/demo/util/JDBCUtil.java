package com.clz.demo.util;

import java.io.FileReader;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * Created by Luke 2019/9/25 14:40
 * JDBC工具类 使用Druid连接池
 */
public class JDBCUtil {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    /**
     * 文件读取，只需要读取一次即可拿到这些值
     */
    static {
        // 读取资源文件，获取值
        try {
            // 1. properties集合
            Properties pro = new Properties();

            // 绝对路径写法
            // pro.load(new FileReader("G:\\project\\IDEA\\JDBC\\src\\cn\\jdbc.properties"));
            // 获取src路径下文件的方式 ---> Classloader类加载器
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL res = classLoader.getResource("druid.properties");
            String path = res.getPath();
            // System.out.println(path);
            // 2. 加载文件
            pro.load(new FileReader(path));
            // 3. 获取数据，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("sqlserverdriver");
            // 4. 注册驱动
            Class.forName(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     *
     * @return连接对象
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放资源
     *
     * @param stmt
     * @param conn
     */
    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
