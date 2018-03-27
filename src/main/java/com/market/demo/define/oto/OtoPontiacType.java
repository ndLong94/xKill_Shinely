package com.market.demo.define.oto;

public enum OtoPontiacType {
    AZTEK("Aztek"),
    FIERO("Fiero"),
    FIREBIRD("Firebird"),
    SOLSTICE("Solstice"),
    TRANS_SPORT("Trans Sport"),
    OTHER("Dòng khác");

    private String brand;

    private OtoPontiacType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}