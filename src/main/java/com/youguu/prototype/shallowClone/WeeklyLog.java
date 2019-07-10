package com.youguu.prototype.shallowClone;

/**
 * 浅克隆
 * 周报类充当具体的原型类
 */
public class WeeklyLog implements Cloneable{

    private Attachment attachment;
    private String date;
    private String name;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //实现clone()方法实现浅克隆
    public WeeklyLog clone(){
        //需要实现cloneable的接口，直接继承object就好，它里面自带一个clone方法

        Object object = null;

        try {
            object = super.clone();
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆方法");
            e.printStackTrace();
        }

        return null;
    }

}
