package com.youguu.abstractFactory.department;

import com.youguu.abstractFactory.pojo.Department;

public class MySqlDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("MySql插入一条部门信息");
    }

    @Override
    public void getDepartment(int id) {
        System.out.println("MySql根据id查询出一条部门信息");
    }
}
