package com.youguu.abstractFactory.department;

import com.youguu.abstractFactory.pojo.Department;

public class SqlServerDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("sqlServer插入一条部门信息");
    }

    @Override
    public void getDepartment(int id) {
        System.out.println("sqlServer根据id查询出一条部门信息");
    }
}
