package com.market.demo.define.moto;

public enum MotoMoto_GuzziType {
    V7("V7"), 
    V9("V9"),
    OTHER("Dòng khác");

    private String brand;

    private MotoMoto_GuzziType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}