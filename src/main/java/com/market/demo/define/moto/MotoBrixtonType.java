package com.market.demo.define.moto;

public enum MotoBrixtonType {
    CUU("CUU"), 
    VUN("VUN"),
    OTHER("Dòng khác");

    private String brand;

    private MotoBrixtonType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}