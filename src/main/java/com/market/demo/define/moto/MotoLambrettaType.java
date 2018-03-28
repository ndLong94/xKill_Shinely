package com.market.demo.define.moto;

public enum MotoLambrettaType {
    A("A"), 
    B("B"),
    C("C"),
    D("D"), 
    E("E"),
    F("F"),
    OTHER("Dòng khác");

    private String brand;

    private MotoLambrettaType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}