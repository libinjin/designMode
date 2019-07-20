package com.youguu.status.demo2;

public class Main {

    public static void main(String[] args) {

        Work work = new Work();

        work.setHour(8);
        work.setState(new ForenoonState());
        work.writeProgram();
        work.setHour(12);
        work.setState(new NoonState());
        work.writeProgram();
    }
}
