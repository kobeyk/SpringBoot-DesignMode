package com.appleyk.DMA10_桥接模式;

import com.appleyk.DMA10_桥接模式.DM10.database.Driver;
import com.appleyk.DMA10_桥接模式.DM10.database.DriverManager;
import com.appleyk.DMA10_桥接模式.DM10.database.MySqlDriver;
import com.appleyk.DMA10_桥接模式.DM10.database.OracleDriver;
import com.appleyk.DMA10_桥接模式.DM10.paint.color.Color;
import com.appleyk.DMA10_桥接模式.DM10.paint.color.Green;
import com.appleyk.DMA10_桥接模式.DM10.paint.color.Red;
import com.appleyk.DMA10_桥接模式.DM10.paint.color.White;
import com.appleyk.DMA10_桥接模式.DM10.paint.shape.Circle;
import com.appleyk.DMA10_桥接模式.DM10.paint.shape.Rectangle;
import com.appleyk.DMA10_桥接模式.DM10.paint.shape.Square;

/**
 * <p>桥接模式测试</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 4:34 2018-11-12
 * @Version V.1.0.1
 */
public class BridgeTest {

    public static void main(String[] args) {
        driverConnect();
        drawShape();

        /**
         * 1、分离抽象接口及其实现部分。提高了比继承更好的解决方案
         * 2、桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统
         * 3、对客户隐藏实现细节
         */
    }

    /**
     * 不同驱动连接数据库
     */
    private static void driverConnect(){

        DriverManager  driverManager = new DriverManager();
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&autoReconnect=true&rewriteBatchedStatements=true";
        String user = "root";
        String pwd = "root";
        // mysql驱动连接数据库
        Driver mySqlDriver = new MySqlDriver(url,user,pwd);
        driverManager.setDriver(mySqlDriver);
        driverManager.connect();
        System.out.println("========= 分割线 =========");
        // oracle驱动连接数据库
        Driver oracleDriver = new OracleDriver();
        driverManager.setDriver(oracleDriver);
        driverManager.connect();
        System.out.println("\n========= 分割线 =========\n");
    }

    /**
     * 绘制不同颜色的形状
     */
    private static void drawShape(){

        //绘制红色的矩形
        Color red = new Red();
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(red);
        rectangle.draw();

        //绘制绿色的正方形
        Color green = new Green();
        Square square = new Square();
        square.setColor(green);
        square.draw();

        //绘制白色的圆形
        Color white = new White();
        Circle circle = new Circle();
        circle.setColor(white);
        circle.draw();
    }
}
