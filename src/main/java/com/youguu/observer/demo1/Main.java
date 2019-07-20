package com.youguu.observer.demo1;

public class Main {

    public static void main(String[] args) {

        Secretary secretary = new Secretary();//发布

        StockObserver observer1 = new StockObserver("tom", secretary);

        StockObserver observer2 = new StockObserver("jack", secretary);

        secretary.attach(observer1);

        //两个观察者订阅了
        secretary.attach(observer2);

        //来了一条消息
        secretary.setAction("老板回来了");

        //通知消息
        secretary.notifyObserver();
    }
}
