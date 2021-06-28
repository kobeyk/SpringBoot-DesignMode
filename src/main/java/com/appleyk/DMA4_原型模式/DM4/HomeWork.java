package com.appleyk.DMA4_原型模式.DM4;

import com.appleyk.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.*;
import java.util.Date;

/**
 * <p>小学生的家庭作业</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 12:59 2018-11-8
 */
public class HomeWork implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业类型
     */
    private EWorkType type = EWorkType.YU_WEN;

    /**
     * 完成时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date finishTime;

    /**
     * 作业页码数【作业量】
     */
    private Integer pages = 0;

    /**
     * 完成者
     */
    private PupilStudent pupilStudent;

    public HomeWork() {

    }

    public EWorkType getType() {
        return type;
    }

    public void setType(EWorkType type) {
        this.type = type;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public PupilStudent getPupilStudent() {
        return pupilStudent;
    }

    public void setPupilStudent(PupilStudent pupilStudent) {
        this.pupilStudent = pupilStudent;
    }

    /**
     * 对象浅拷贝  == 对象中按值类型传递部分均能完美拷贝走，但是按引用类型传递部分则拷贝不走
     *
     * @return HomeWork
     * @throws CloneNotSupportedException
     */
    @Override
    public HomeWork clone() throws CloneNotSupportedException {
        return (HomeWork) super.clone();
    }

    /**
     * 深度拷贝 == 不管你对象中是值类型部分，还是引用类型部分，我全部拿走
     * 对象字节流的序列与反序列化 ==> 对象完全、深度、彻彻底底的Copy！！！
     *
     * @return HomeWork
     */
    public HomeWork deepClone() {

        // Anything 都是可以用字节流进行表示，记住是任何！
        HomeWork homeWork = null;
        try {

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            // 将当前的对象写入baos【输出流 -- 字节数组】里
            oos.writeObject(this);

            // 从输出字节数组缓存区中拿到字节流
            byte[] bytes = baos.toByteArray();

            // 创建一个输入字节数组缓冲区
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            // 创建一个对象输入流
            ObjectInputStream ois = new ObjectInputStream(bais);
            // 下面将反序列化字节流 == 重新开辟一块空间存放反序列化后的对象
            homeWork = (HomeWork) ois.readObject();

        } catch (Exception e) {
            System.out.println(e.getClass() + ":" + e.getMessage());
        }
        return homeWork;
    }

    @Override
    public String toString() {
        return String.format("类型：%s,页数：%s,完成时间：%s," +
                        "完成者：%s,学号：%d,年级：%d,年龄:%d,性别：%s", this.type.getName()
                , this.pages, DateUtils.date2Str(this.finishTime), this.pupilStudent.getName(),
                this.pupilStudent.getsNo(), this.pupilStudent.getsClass(),
                this.pupilStudent.getAge(), this.pupilStudent.getSex().getName());
    }
}
