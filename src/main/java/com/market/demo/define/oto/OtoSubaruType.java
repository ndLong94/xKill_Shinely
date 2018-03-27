package com.market.demo.define.oto;

public enum OtoSubaruType {
    BRZ("BRZ"),
    FORESTER("Forester"),
    IMPREZA("Impreza"),
    LEGACY("Legacy"),
    LEVORD("Levord"),
    OUTBACK("Outback"),
    TRIBECA("Tribeca"),
    WRX("WRX"),
    XV("XV"),
    OTHER("Dòng khác");

    private String brand;

    private OtoSubaruType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}