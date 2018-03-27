package com.market.demo.define.moto;

public enum MotoBMWType {
    C600("C600"), 
    C650("C650"),
    F800("F800"),
    F800GS("F800GS"), 
    R_NINE_T("R Nine T"),
    R1200("R1200"),
    S1000R("S1000R"), 
    S1000RR("S1000RR"),
    OTHER("Dòng khác");

    private String brand;

    private MotoBMWType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}