package com.appleyk.DMB14_模板方法.DM14.JDBC模板And回调实现;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>数据库操作模板类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class JdbcTemplate {

    public final Object execute(StatementCallback callback) throws SQLException {

        // 1、首先获取数据库连接对象
        Connection connection = getConnection();
        // 2、根据连接获取statement对象（数据库操作对象）
        Statement stmt = getStament(connection);
        // 3、根据stmt回调子类方法 --> 执行sql语句获取最终结果
        return callback.doInStatement(stmt);

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

    public Object executeQuery(StatementCallback callback) throws SQLException{
        return execute(callback);
    }

    /**
     * 如果该类是抽象类，则定义以下四个抽象方法，则其子类必须全部实现
     * 回调的好处，即子类只需要实现父类中的某一个方法即可，该方法可以抽离成一个接口的方法
     */
//    protected abstract void A();
//    protected abstract void B();
//    protected abstract void C();
//    protected abstract void D();
}
