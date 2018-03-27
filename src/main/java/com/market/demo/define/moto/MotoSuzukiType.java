package com.market.demo.define.moto;

public enum MotoSuzukiType {
    SPORT_XIPO("Sport / Xipo"), 
    RAIDER("Raider"),
    GSX("GSX"),
    GD("GD"), 
    AXELO("Axelo"),
    SATRIA("Satria"),
    GN("GN"), 
    GZ("GZ"),
    BELLA("Bella"),
    BEST("Best"), 
    CRYSTAL("Crystal"),
    EPICURO("Epicuro"),
    EN("EN"), 
    FX125("FX125"),
    HAYATE("Hayate"),
    HUSKY("Husky"), 
    IMPULSE("Impulse"),
    REVO("Revo"),
    RGV("RGV"), 
    ROYAL("Royal"),
    SAPPHIRE("Sapphire"),
    SMASH("Smash"), 
    STINGER("Stinger"),
    V_STROM("V-Strom"),
    VIVA("Viva"), 
    XBIKE("XBike"),
    OTHER("Dòng khác");
    
    private String brand;

    private MotoSuzukiType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}