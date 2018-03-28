package com.market.demo.define.moto;

public enum MotoRegal_RaptorType {
    BOBBER("Bobber"),
    CRUISER("Cruiser"), 
    DAYTONA("Daytona"),
    EURO_REIBEL("Euro Reibel"),
    OTHER("Dòng khác");

    private String brand;

    private MotoRegal_RaptorType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}