package com.youguu.abstractFactory.factory;


import com.youguu.abstractFactory.department.IDepartment;
import com.youguu.abstractFactory.user.IUser;

public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();

}
