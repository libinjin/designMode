package com.youguu.status.demo2;

public class AfternooState extends State{

    @Override
    public void writeProgram(Work work) {

        //到了下午了
        if(work.getHour() <18){

            System.out.println("当前时间："+work.getHour()+" ,下午工作状态不错，继续努力");
        }else{
            work.setState(new EveningState());
            work.writeProgram();
        }


    }
}
