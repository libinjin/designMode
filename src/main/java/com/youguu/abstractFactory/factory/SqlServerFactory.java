package com.youguu.abstractFactory.factory;

import com.youguu.abstractFactory.department.IDepartment;
import com.youguu.abstractFactory.department.SqlServerDepartment;
import com.youguu.abstractFactory.user.IUser;
import com.youguu.abstractFactory.user.SqlServerUser;

public class SqlServerFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
