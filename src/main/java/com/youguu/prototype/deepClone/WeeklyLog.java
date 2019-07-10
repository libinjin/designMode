package com.youguu.prototype.deepClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 浅克隆
 * 周报类充当具体的原型类
 */
public class WeeklyLog implements Serializable {

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
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);

        oos.writeObject(this);

        //将对象取出来

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(bis);

        WeeklyLog weeklyLog = (WeeklyLog) ois.readObject();

        return weeklyLog;
    }


}
