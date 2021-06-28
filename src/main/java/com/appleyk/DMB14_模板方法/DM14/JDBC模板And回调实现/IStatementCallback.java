package com.appleyk.DMB14_模板方法.DM14.JDBC模板And回调实现;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>数据库操作回调接口</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 */
public interface IStatementCallback {

    Object doInStatement(Statement stmt) throws SQLException;

}
