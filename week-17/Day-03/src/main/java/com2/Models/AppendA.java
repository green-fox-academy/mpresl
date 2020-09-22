package com2.Models;

public class AppendA {
    private String appended;

    public AppendA(String appended) {
        this.appended = appended + "a";
    }

    public AppendA() {
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
