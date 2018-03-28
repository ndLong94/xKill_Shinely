package com.market.demo.define.moto;

public enum MotoKeewayType {
    BLACKSTER("Blackster"), 
    OTHER("Dòng khác");

    private String brand;

    private MotoKeewayType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}