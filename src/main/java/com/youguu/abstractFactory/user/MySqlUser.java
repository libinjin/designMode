package com.youguu.abstractFactory.user;

import com.youguu.abstractFactory.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class MySqlUser implements IUser{

    @Override
    public void insert(User user) {
        System.out.println("用mysql中插入一个员工");
    }

    @Override
    public void queryUser(int id) {
        List list = new ArrayList();
        System.out.println("用mysql查询出一个员工");
    }
}
