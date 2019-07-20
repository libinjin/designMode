package com.youguu.status.demo1;

public class Main {

    public static void main(String[] args) {

        Context c = new Context(new ConcreteStateA());

        c.request();//此时利用Context将status设置为ConcreteStateB

        Status status = c.getStatus();

        System.out.println(status.getClass().getName());
    }
}
