package com.market.demo.define.moto;

public enum MotoPeugeotType {
	_102("102"), 
	_103("103"),
	_104("104"),
    CITYSTAR("Citystar"), 
    DJANGO("Django"),
    SATELIS("Satelis"), 
    OTHER("Dòng khác");
    
    private String brand;

    private MotoPeugeotType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}