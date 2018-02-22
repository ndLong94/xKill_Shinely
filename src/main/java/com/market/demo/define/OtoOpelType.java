package com.market.demo.define;

public enum OtoOpelType {
    ANTARA("Antara"),
    ASTRA("Astra"),
    COMBO("Combo"),
    CORSA("Corsa"),
    GT("GT"),
    OMEGA("Omega"),
    RECORD("Record"),
    TIGRA("Tigra"),
    VECTRA("Vectra"),
    OTHER("Dòng khác");

    private String brand;

    private OtoOpelType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}