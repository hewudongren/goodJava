package com.jwi.红包案例;

public abstract class User {
    private String username;
    private double leftMoney;

    public User(String username, double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
}
