package com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task3;

public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }

    public String exDivision() {
        return "На ноль делить нельзя";
    }
}
