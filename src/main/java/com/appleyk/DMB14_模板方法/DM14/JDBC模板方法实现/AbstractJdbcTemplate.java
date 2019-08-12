package com.appleyk.DMB14_模板方法.DM14.JDBC模板方法实现;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>模拟JDB模板类（可以理解为伪代码说明）</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public abstract class AbstractJdbcTemplate {

    public final Object execute(String sql) throws SQLException {

        // 1、首先获取数据库连接对象
        Connection connection = getConnection();
        // 2、根据连接获取statement对象（数据库操作对象）
        getStament(connection);
        // 3、使用数据库操作对象来执行对应的SQL语句
        ResultSet rs = executeQuery(sql);
        // 4、最后基于查询的数据集，处理并返回最终结果
        return doInStatement(rs);

        // 资源的释放这里我就省略了
    }

    private Connection getConnection(){
        System.out.println("获取数据库连接");
        return null;
    }

    private Statement getStament(Connection connection){
        System.out.println("获取数据库操作对象");
        return null;
    }

    private ResultSet executeQuery(String sql){
        System.out.println("执行SQL语句："+sql);
        return null;
    }

    /**
     * <p>基于结果集进行定制，由具体的子类实现</p>
     * @param rs 结果集
     * @return 数据模型对象
     */
    protected abstract Object doInStatement(ResultSet rs) throws SQLException;

}
