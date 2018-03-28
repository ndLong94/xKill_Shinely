package com.market.demo.define.moto;

public enum MotoHarley_DavidsonType {
    CVO("CVO"), 
    DYNA("Dyna"),
    SOFTAIL("Softail"),
    SPORTSTER("Sportster"), 
    STREET("Street"),
    TOURING("Touring"),
    V_ROD("V-Rod"), 
    V_ROD_MUSCLE("V-Rod Muscle"),
    XL_1200X_FORTY_EIGHT("XL 1200 Forty-Eight"),
    OTHER("Dòng khác");

    private String brand;

    private MotoHarley_DavidsonType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}