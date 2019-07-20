package com.youguu.abstractFactory.user;

import com.youguu.abstractFactory.pojo.User;

public interface IUser {

    void insert(User user);

    void queryUser(int id);
}
