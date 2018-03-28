package com.market.demo.define.moto;

public enum MotoMV_AgustaType {
	BRUTALE_3_CYLIND("Brutale 3 Cylind"), 
	BRUTALE_4_CYLIND("Brutale 4 Cylind"),
    DRAGSTER("Dragster"),
    F3("F3"), 
    F4("F4"),
    RIVALE("Rivale"),
    STRADALE("Stradale"), 
    TURISMO_VELoCE("Turismo Veloce"),
    PEOPLE_16_S("People 16 S"),
    OTHER("Dòng khác");

    private String brand;

    private MotoMV_AgustaType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}