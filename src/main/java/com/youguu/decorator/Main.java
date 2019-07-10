package com.youguu.decorator;

public class Main {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();

        DecorateA d1 = new DecorateA();
        DecorateB d2 = new DecorateB();

        d1.setComponent(c);
        d2.setComponent(d1);

        d2.opreation();


    }
}
