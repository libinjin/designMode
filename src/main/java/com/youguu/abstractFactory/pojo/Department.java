package com.youguu.abstractFactory.pojo;

public class Department {

    private String departNo;
    private String name;
    private int num;

    public Department(String departNo, String name, int num) {
        this.departNo = departNo;
        this.name = name;
        this.num = num;
    }

    public String getDepartNo() {
        return departNo;
    }

    public void setDepartNo(String departNo) {
        this.departNo = departNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
