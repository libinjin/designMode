package com.youguu.prototype.deepClone;

import java.io.IOException;

public class Client {

    //测试类，客户端
    public static void main(String[] args) {

        WeeklyLog weeklyLog1 = new WeeklyLog();

        Attachment attachment = new Attachment();

        weeklyLog1.setAttachment(attachment);

        WeeklyLog weeklyLog2 = null;
        try {
            weeklyLog2 = weeklyLog1.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("周报是否相同："+(weeklyLog1 == weeklyLog2));

        System.out.println("附件是否相同："+(weeklyLog1.getAttachment() == weeklyLog2.getAttachment()));
    }
}
