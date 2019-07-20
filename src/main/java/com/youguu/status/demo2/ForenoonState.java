package com.youguu.status.demo2;

/**
 * 上午和中午工作状态类
 */
public class ForenoonState extends State{

    @Override
    public void writeProgram(Work work) {
        //12点前
        if(work.getHour() < 12){
            System.out.println("当前时间:"+work.getHour()+"上午工作，精神百倍");
        }else{
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
