package com.market.demo.define;

public enum OtoRoverType {
    _100("100"),
    _200("200"),
    _400("400"),
    _800("800"),
    OTHER("Dòng khác");

    private String brand;

    private OtoRoverType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}