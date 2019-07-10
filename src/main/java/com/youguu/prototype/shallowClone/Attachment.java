package com.youguu.prototype.shallowClone;

/**
 * 浅克隆
 * 附件
 */
public class Attachment {

    private String name;	//附件名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件"+name);
    }
}
