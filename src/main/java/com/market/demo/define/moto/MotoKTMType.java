package com.market.demo.define.moto;

public enum MotoKTMType {
    _390("390"),
    _1190_RC8R("1190 RC8R"), 
    _1290_SUPER_DUKE_R("1290 Super Duke R"),
    _1290_SUPER_ADVANTURE("1290 Super Advanture"),
    DUKE_200("Duke 200"), 
    DUKE_250("Duke 250"),
    DUKE_390("Duke 390"),
    DUKE_690("Duke 690"),     
    RC_200("RC 200"), 
    RC_250("RC 250"),
    RC_390("RC 390"),
    OTHER("Dòng khác");

    private String brand;

    private MotoKTMType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}