package com.appleyk.DMA10_桥接模式.DM10.database;

/**
 * <p>MySql数据库驱动类</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 4:36 2018-11-12
 * @version V.0.1.1
 */
public class MySqlDriver implements Driver {

    private String url;
    private String user;
    private String pwd;
    public MySqlDriver(String url, String user, String pwd){
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }
    @Override
    public void connect() {
        System.out.println("url："+this.url);
        System.out.println("user："+this.user);
        System.out.println("pwd："+this.pwd);
        System.out.println("mysql驱动连接数据库");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
