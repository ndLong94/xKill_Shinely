package com.market.demo.define.moto;

public enum MotoMalagutiType {
    F12("F12"), 
    GRIZZLY("Grizzly"),
    MADISON("Madison"),
    OTHER("Dòng khác");

    private String brand;

    private MotoMalagutiType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}