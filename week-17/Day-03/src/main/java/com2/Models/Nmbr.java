package com2.Models;

public class Nmbr {
    private Integer received;
    private Integer result;
    private String error;

    public Nmbr(int input) {
        this.received = input;
        this.result = input*2;
    }

    public Nmbr() {
        this.error = "Please provide an input!";
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
