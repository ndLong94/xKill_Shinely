package com.market.demo.define.moto;

public enum MotoRebelUSAType {
    CBR("CBR"),
    CDR("CDR"), 
    DELUXE("Deluxe"),
    NOTUS("Notus"),
    REBELL("Rebell"), 
    OTHER("Dòng khác");

    private String brand;

    private MotoRebelUSAType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}