package com.youguu.status.demo2;


/**
 * 工作类
 */
public class Work {

    //状态
    private State currentState;

    //工作时间
    private double hour;

    //工作完成情况
    private boolean finish;

    public State getState() {
        return currentState;
    }

    public void setState(State currentState) {
        this.currentState = currentState;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    //写程序
    public void writeProgram(){
        currentState.writeProgram(this);
    }
}
