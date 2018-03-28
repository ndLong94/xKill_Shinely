package com.market.demo.define.moto;

public enum MotoHyosungType {
    _125_250("125/250"), 
    AQUILA("Aquila"),
    GT("GV"),
    GV("GV"), 
    ST("ST"),
    OTHER("Dòng khác");

    private String brand;

    private MotoHyosungType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}