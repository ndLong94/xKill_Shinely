package com.market.demo.define.moto;

public enum MotoKengoType {
    CLASSIC_400("Classic 400"),
    CUSTOM_2017("Custom 2017"), 
    E_BIKES("E-Bikes"),
    OFF_ROAD("Off Road"),
    R250("R250"), 
    R350("R350"),
    SCOOTER("Scooter"),
    X350("X350"), 
    OTHER("Dòng khác");

    private String brand;

    private MotoKengoType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}