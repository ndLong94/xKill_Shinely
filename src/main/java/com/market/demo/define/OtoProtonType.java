package com.market.demo.define;

public enum OtoProtonType {
    ARENA("Arena"),
    PERDANA("Perdana"),
    TIARA("Tiara"),
    WIRA("Wira"),
    OTHER("Dòng khác");

    private String brand;

    private OtoProtonType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}