package com.youguu.prototype.shallowClone;

public class Client {

    //测试类，客户端
    public static void main(String[] args) {

        WeeklyLog weeklyLog1 = new WeeklyLog();

        Attachment attachment = new Attachment();

        weeklyLog1.setAttachment(attachment);

        WeeklyLog weeklyLog2 = weeklyLog1.clone();

        System.out.println("周报是否相同："+(weeklyLog1 == weeklyLog2));

        System.out.println("附件是否相同："+(weeklyLog1.getAttachment() == weeklyLog2.getAttachment()));
    }
}
