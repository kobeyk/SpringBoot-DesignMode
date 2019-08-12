package com.appleyk.DMB14_模板方法.DM14.JDBC模板And回调实现;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>用户查询业务类</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:05 2018-11-21
 * @Version V.1.0.1
 */
public class UserQueryServiceImpl{

    public Object query(String sql) throws SQLException{
      return  new JdbcTemplate().executeQuery(new UserQueryStatementCallBack(sql));
    }

}

/**
 * <p>内部类 == 用户查询数据库操作对象回调类</p>
 */
class UserQueryStatementCallBack implements StatementCallback{

    private String sql ;

    public UserQueryStatementCallBack(String sql){
        this.sql = sql;
    }

    @Override
    public Object doInStatement(Statement stmt) throws SQLException {
        System.out.println("执行SQL语句："+sql);
        System.out.println("数据集处理成功，返回User数据实体对象");
        return null;
    }

}
