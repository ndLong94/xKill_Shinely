package com.market.demo.define;

public enum OtoPorsche {
    _911("911"),
    BOXSTER("Boxster"),
    CARRERA("Carrera"),
    CAYENNE("Cayenne"),
    CAYMAN("Cayman"),
    MACAN("Macan"),
    PANAMERA("Panamera"),
    OTHER("Dòng khác");

    private String brand;

    private OtoPorsche(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}