package com.youguu.status.demo1;

public class Context {

    private Status status;

    public Context(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void request(){
        status.Handler(this);
    }

}
