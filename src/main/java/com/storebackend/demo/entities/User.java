package com.storebackend.demo.entities;

public class User {
    private String userId;
    private int totalMoney;

    public User(String userId, int totalMoney) {
        this.userId = userId;
        this.totalMoney = totalMoney;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
