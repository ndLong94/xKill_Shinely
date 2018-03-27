package com.market.demo.define.oto;

public enum OtoTeslaType {
    _3("3"),
    _S("S"),
    _X("X"),
    OTHER("Dòng khác");

    private String brand;

    private OtoTeslaType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}