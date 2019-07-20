package com.youguu.abstractFactory.factory;

import com.youguu.abstractFactory.department.IDepartment;
import com.youguu.abstractFactory.department.MySqlDepartment;
import com.youguu.abstractFactory.user.IUser;
import com.youguu.abstractFactory.user.MySqlUser;

public class MySqlFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySqlDepartment();
    }
}
