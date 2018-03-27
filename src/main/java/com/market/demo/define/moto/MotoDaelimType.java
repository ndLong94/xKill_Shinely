package com.market.demo.define.moto;

public enum MotoDaelimType {
    A_4("A-4"), 
    B_BONE("B-Bone"),
    BESBI_125("Besbi 125"),
    BS("BS"), 
    CUB("Cub"),
    DAY_STAR_125Fi("Day Star 125Fi"),
    E_FIVE("E-Five"), 
    NS_125("Nozza"),
    ROADWIN_125("RoadWin 125"),
    S4("S4"), 
    VS125("VS125"),
    OTHER("Dòng khác");

    private String brand;

    private MotoDaelimType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}