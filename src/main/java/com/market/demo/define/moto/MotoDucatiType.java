package com.market.demo.define.moto;

public enum MotoDucatiType {
	MONSTER("Monster"), 
    SCRAMBLER("Scrambler"),
    HYPERMOTARD("Hypermotard"),
    STREETFIGHTER("Streetfighter"), 
    _899_PANIGALE("899 Panigale"),
    DIAVEL("Diavel"),
    _1199_PANIGALE("1199 Panigale"), 
    MULTISTRADA("Multistrada"),
    OTHER("Dòng khác");
    
    private String brand;

    private MotoDucatiType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}