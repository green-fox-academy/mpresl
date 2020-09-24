package com2.Models;

public class ArrayInfo {
    private String what;
    private long[] numbers;

    public ArrayInfo(String what, long[] nums) {
        this.what = what;
        this.numbers = nums;
    }

    public ArrayInfo() { }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public long[] getNumbers() {
        return numbers;
    }

    public void setNums(long[] nums) {
        this.numbers = nums;
    }
}
