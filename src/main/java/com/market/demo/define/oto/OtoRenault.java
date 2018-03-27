package com.market.demo.define.oto;

public enum OtoRenault {
    _11("11"),
    _19("19"),
    _21("21"),
    _25("25"),
    CLIO("Clio"),
    DUSTER("Duster"),
    FLUENCE("fluence"),
    KANGOO("Kangoo"),
    KOLEOS("Koleos"),
    LAGUNA("Laguna"),    
    LATITUDE("Latitude"),
    MEGANE("Megane"),
    SAFRANE("Safrane"),
    SANDERO("Sandero"),
    SPORT_SPIDER("Sport Spider"),
    TRAFIC("Trafic"),
    WIND("Wind"),
    OTHER("Dòng khác");

    private String brand;

    private OtoRenault(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}