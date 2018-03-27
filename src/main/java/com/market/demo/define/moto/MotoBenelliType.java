package com.market.demo.define.moto;

public enum MotoBenelliType {
    _302R("302R"), 
    BN_302("BN 302"),
    BN_600i("BN 600i"),
    CAFFE_NERO("Caffe Nero"), 
    PEPE("Pepe"),
    T15("T15"),
    TNT("TNT"), 
    TRK("TRK"),
    VLM("VLM"),
    OTHER("Dòng khác");

    private String brand;

    private MotoBenelliType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}