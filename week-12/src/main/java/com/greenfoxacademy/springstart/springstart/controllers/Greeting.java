package com.greenfoxacademy.springstart.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private String content;
    private static AtomicLong greetCount = new AtomicLong(0);

    public Greeting(String content) {
        this.content = content;
        greetCount.addAndGet(1);
    }

    public Greeting(){
        greetCount.addAndGet(1);
    }
    public AtomicLong getGreetCount(){
        return greetCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
