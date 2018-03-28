package com.market.demo.define.moto;

public enum MotoHalimType {
    OTHER("Dòng khác");

    private String brand;

    private MotoHalimType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}