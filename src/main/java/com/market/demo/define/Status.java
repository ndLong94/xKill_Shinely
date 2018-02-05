package com.market.demo.define;

public enum Status {
    NEW("new"), WARRANTY("warranty"), OLD("old");

    private String status;

    private Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;

    }
}