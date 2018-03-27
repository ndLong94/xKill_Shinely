package com.market.demo.define.moto;

public enum MotoBazanType {
    DREAM("Dream"), 
    OTHER("Dòng khác");

    private String brand;

    private MotoBazanType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}