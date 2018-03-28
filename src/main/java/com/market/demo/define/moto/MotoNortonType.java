package com.market.demo.define.moto;

public enum MotoNortonType {
	COMMANDOR("Commandor"), 
    DOMINATOR("Dominator"),
    OTHER("Dòng khác");
    
    private String brand;

    private MotoNortonType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}