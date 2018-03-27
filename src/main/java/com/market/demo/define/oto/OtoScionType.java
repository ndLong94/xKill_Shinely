package com.market.demo.define.oto;

public enum OtoScionType {
    TC("Tc"),
    XD("Xd"),
    OTHER("Dòng khác");

    private String brand;

    private OtoScionType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}