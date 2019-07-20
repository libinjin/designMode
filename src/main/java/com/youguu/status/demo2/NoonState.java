package com.youguu.status.demo2;

/**
 * 中午工作状态
 */
public class NoonState extends State{

    @Override
    public void writeProgram(Work work) {

        if(work.getHour() < 13){
            System.out.println("当前时间："+work.getHour()+"饿了，犯困，该休息了");
        }else{
            //超过13点，则转入下午工作状态
            work.setState(new AfternooState());
            work.writeProgram();
        }
    }
}
