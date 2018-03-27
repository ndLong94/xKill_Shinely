package com.market.demo.define.oto;

public enum OtoSamsungType {
    QM5("QM5"),
    SM3("SM3"),
    SM5("SM5"),
    SM7("SM7"),
    OTHER("Dòng khác");

    private String brand;

    private OtoSamsungType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}