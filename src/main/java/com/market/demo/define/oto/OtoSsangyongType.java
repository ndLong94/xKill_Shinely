package com.market.demo.define.oto;

public enum OtoSsangyongType {
    ACTYON("Actyon"),
    CHAIRMAN("Chairman"),
    FAMILY("Family"),
    ISTALA("Istala"),
    KORANDO("Korando"),
    KYRON("Kyron"),
    MUSSO("Musso"),
    REXTON("Rexton"),
    STAVIC("Stavic"),
    TIVOLI("Tivoli"),    
    XLV("XLV"),
    OTHER("Dòng khác");

    private String brand;

    private OtoSsangyongType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}