package com.youguu.adapter;

public class Main {

    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦迪");
        m.attack();

        Player ym = new CenterTranslator("姚明");
        ym.attack();
        ym.defense();
    }
}
