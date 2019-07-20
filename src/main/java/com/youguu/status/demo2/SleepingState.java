package com.youguu.status.demo2;

public class SleepingState extends State{


    @Override
    public void writeProgram(Work work) {

        System.out.println("当请时间:"+work.getHour()+",不行了，睡着了");
    }
}
