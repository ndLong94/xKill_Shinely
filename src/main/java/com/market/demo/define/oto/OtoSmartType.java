package com.market.demo.define.oto;

public enum OtoSmartType {
    COUPE("Coupe"),
    FORFOUR("Forfour"),
    FORTWO("Fortwo"),
    ROADSTER("Roadster"),
    OTHER("Dòng khác");

    private String brand;

    private OtoSmartType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}