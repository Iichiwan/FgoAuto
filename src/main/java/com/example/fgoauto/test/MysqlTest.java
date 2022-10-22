package com.example.fgoauto.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MysqlTest {


    public static void test() {
        //dpxxxx-xxxxxxxx.proxy.dms.aliyuncs.com:3306是目标实例的连接地址与端口号。可在安全访问代理页面的MySQL协议地址获取连接地址与端口号。
        //schema是目标实例的数据库名称。
        String url = "jdbc:mysql://dphzmy-qnz8glf4gtnkmhra-pub.proxy.dms.aliyuncs.com:3306";
        Properties properties = new Properties();
        //AccessID是您的AccessID。可在安全访问代理页面的被授权人列表中查看。
        properties.setProperty("user", "thTJPph95CD7hUedItFZS7mz");
        //AccessSecret是您的AccessSecret。可在安全访问代理页面的被授权人列表中查看。
        properties.setProperty("password", "bMXZ8OcaQMEPs5HKFLs2oj22LO3zIg");
        try (Connection connection = DriverManager.getConnection(url, properties)) {
            try (Statement statement = connection.createStatement()) {
                //使用execute方法执行SQL语句。本示例以SHOW DATABASES为例，您也可以换成其它SQL语句。
                statement.execute("SHOW DATABASES");
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
