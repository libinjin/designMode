package com.youguu.sell;

import com.youguu.sell.startegyImp.CashNormal;
import com.youguu.sell.startegyImp.CashRebate;
import com.youguu.sell.startegyImp.CashReturn;

import java.io.Console;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestStrategy {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //执行普通收费
        Context context = null;

        String type = "normal";


        Class cls = Class.forName("");

        Object object = cls.newInstance();

        Method method = cls.getMethod("",java.lang.String.class);

        method.invoke(object, "asf");//反射执行



        switch (type){
            case "normal":
                context = new Context(new CashNormal());
                break;
            case "rebat" :
                context = new Context(new CashRebate(0.8));
                break;
            case "retMoney" :
                context = new Context(new CashReturn(300,100));
                break;
        }
        double cash = 90;
        //1.具体算法与客户端进行了隔离，策略模式实现
        context.getResult(cash);

        //2.策略模式结合简单工厂
        CashContext cashContext = new CashContext("rebat");

        cashContext.getResult(100);

    }
}
