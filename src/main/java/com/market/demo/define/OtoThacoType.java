package com.market.demo.define;

public enum OtoThacoType {
    AUMAN("Auman"),
    AUMARK("Aumark"),
    FORLAN("Forland"),
    FOTON("Foton"),
    FRONTIER("Frontier"),
    MOBIHOME("Mobihome"),
    OLLIN("Ollin"),
    TOWNER("Towner"),
    OTHER("Dòng khác");

    private String brand;

    private OtoThacoType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}