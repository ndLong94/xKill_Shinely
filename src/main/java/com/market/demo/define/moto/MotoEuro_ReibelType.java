package com.market.demo.define.moto;

public enum MotoEuro_ReibelType {
    OTHER("Dòng khác");

    private String brand;

    private MotoEuro_ReibelType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}