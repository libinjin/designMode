package com.youguu.decorator;

public class DecorateB extends Decorate{

    @Override
    public void opreation() {
        super.opreation();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior(){
        System.out.println("B类特有方法addedBehavior");
    }
}
