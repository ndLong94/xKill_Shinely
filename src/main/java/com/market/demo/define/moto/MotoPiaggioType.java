package com.market.demo.define.moto;

public enum MotoPiaggioType {
    VESPA("Vespa"), 
    LIBERTY("Liberty"),
    ZIP("Zip"),
    LX("LX"), 
    GTS("GTS"),
    FLY("Fly"),
    SPRINT("Sprint"), 
    PRIMAVERA("Primavera"),
    BEVERLY("Beverly"),
    ET8("ET8"), 
    GT("GT"),
    MEDLEY("Medley"),
    PX("PX"), 
    VESPA_S125("Vespa S125"),
    OTHER("Dòng khác");

    private String brand;

    private MotoPiaggioType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}