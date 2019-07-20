package com.youguu.status.demo2;

public class EveningState extends State{

    @Override
    public void writeProgram(Work work) {

        //到了晚上了
        if(work.isFinish()){
            work.setState(new RestState());
            work.writeProgram();
        }else{
            if(work.getHour() < 21){
                System.out.println("当前时间:"+work.getHour()+" ,疲惫至极");
            }else{
                //该睡觉了

                work.setState(new SleepingState());
                work.writeProgram();

            }
        }


    }
}
