package com.market.demo.define.moto;

public enum MotoCR_SType {
    BX_125("BX 125"), 
    BX_150("BX_150"),
    OTHER("Dòng khác");

    private String brand;

    private MotoCR_SType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}