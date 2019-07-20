package com.youguu.builder;

public class Main {

    public static void main(String[] args) {

        //建造产品A
        Builder1 builder1 = new Builder1();

        Director director1 = new Director(builder1);

        Product p1 = builder1.getResult();

        p1.show();

        Builder2 builder2 = new Builder2();

        //建造
        Director director2 = new Director(builder2);

        Product p2 = builder2.getResult();

        p2.show();


    }
}
