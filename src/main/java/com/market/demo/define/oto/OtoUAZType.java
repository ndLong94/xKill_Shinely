package com.market.demo.define.oto;

public enum OtoUAZType {
    HUNTER("1200B"),
    PATRIOT("1240T"),
    PICKUP("1490T"),
    OTHER("Dòng khác");

    private String brand;

    private OtoUAZType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}