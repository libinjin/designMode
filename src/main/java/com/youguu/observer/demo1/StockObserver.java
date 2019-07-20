package com.youguu.observer.demo1;

/**
 * 观察者类
 */
public class StockObserver {

    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update(){

        String str = sub.getAction()+" ,"+name;
        System.out.println(str);
        System.out.println(name+"关闭股票行情，继续工作");
    }
}
