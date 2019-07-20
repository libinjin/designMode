package com.youguu.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知类
 */
public class Secretary {

    private List<StockObserver> observers = new ArrayList<>();

    /**
     * 通知发生的事情
     */
    private String action;

    public void attach(StockObserver observer){
        observers.add(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObserver(){
        for (StockObserver observer : observers) {
            observer.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
