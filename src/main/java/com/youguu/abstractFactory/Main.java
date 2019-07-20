package com.youguu.abstractFactory;

import com.youguu.abstractFactory.department.IDepartment;
import com.youguu.abstractFactory.factory.IFactory;
import com.youguu.abstractFactory.factory.MySqlFactory;
import com.youguu.abstractFactory.factory.SqlServerFactory;
import com.youguu.abstractFactory.pojo.Department;
import com.youguu.abstractFactory.pojo.User;
import com.youguu.abstractFactory.user.IUser;

public class Main {

    public static void main(String[] args) {

        IFactory factory = new MySqlFactory();

        IDepartment department = factory.createDepartment();

        department.insert(new Department("00001","开发部",10));

        department.getDepartment(1);

        factory = new SqlServerFactory();

        IUser user = factory.createUser();

        user.insert(new User(1, "沙发", "12345"));
    }
}
