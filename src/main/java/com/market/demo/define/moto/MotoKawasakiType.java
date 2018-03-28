package com.market.demo.define.moto;

public enum MotoKawasakiType {
    Z1000("Z1000"), 
    Z300("Z300"),
    NINJA("Ninja"),
    MAX("Max"), 
    Z800("Z800"),
    VULCAN("Vulcan"),
    Z900("Z900"), 
    ESTRELLA("Estrella"),
    BOSS("Boss"),    
    KAWASAKI("Kawasaki"), 
    KSR("KSR"),
    LEO("Leo"),
    VERSYS("Versys"), 
    W800("Z800"),
    W650("W650"),
    W400("W400"), 
    Z125("Z125"),
    Z250("Z250"),
    Z400("Z400"), 
    Z650("Z650"),
    ZX10R("ZX10R"),
    ZX6J("ZX6J"),
    ZX6R("ZX6R"),
    OTHER("Dòng khác");

    private String brand;

    private MotoKawasakiType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}