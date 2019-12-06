package com.appleyk.DMB14_模板方法.DM14.JDBC模板And回调实现;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>数据库操作回调接口</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:05 2018-11-21
 * @version V.0.1.1
 */
public interface StatementCallback {

    Object doInStatement(Statement stmt) throws SQLException;

}
