package com.market.demo.define;

public enum OtoFuelUsingType {
    GAS("Xăng"),
    OIL("Dầu"),
    HYBRID("Động cơ Hybrid");

    private String demand;

    private OtoFuelUsingType(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return demand;

    }
}