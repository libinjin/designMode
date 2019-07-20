package com.youguu.abstractFactory.user;

import com.youguu.abstractFactory.pojo.User;

public class SqlServerUser implements IUser{

    @Override
    public void insert(User user) {
        System.out.println("用SqlServer中插入一个员工");
    }

    @Override
    public void queryUser(int id) {
        System.out.println("用SqlServer查询出一个员工");
    }
}
