package com.youguu.decorator;

public class DecorateA extends Decorate{

    //本类独有的功能
    private String addedState;

    @Override
    public void opreation() {
        super.opreation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
