package com.market.demo.define.oto;

public enum OtoSYMType {
    T1000("T1000"),
    T880("T880"),
    V11("V11"),
    V5("V5"),
    OTHER("Dòng khác");

    private String brand;

    private OtoSYMType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}