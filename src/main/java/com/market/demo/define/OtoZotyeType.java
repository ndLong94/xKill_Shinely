package com.market.demo.define;

public enum OtoZotyeType {
    T600("T600"),
    Z100("Z100"),
    Z300("Z300"),
    Z500("Z500"),
    OTHER("Dòng khác");

    private String brand;

    private OtoZotyeType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}