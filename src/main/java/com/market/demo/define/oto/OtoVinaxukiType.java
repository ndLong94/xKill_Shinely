package com.market.demo.define.oto;

public enum OtoVinaxukiType {
    _1200B("1200B"),
    _1240T("1240T"),
    _1490T("1490T"),
    _1980T("1980T"),
    _1990BA("1990BA"),
    _2500BA("2500BA"),
    _3450T("3450T"),
    _3500TL("3500TL"),
    _4500BA("4500BA"),
    _5000BA("5000BA"),    
    _5500TL("5500TL"),
    _7000BA("7000BA"),
    _990T("990T"),
    HARFEI("Harfei"),
    JINBEI("Jinbei"),
    OTHER("Dòng khác");

    private String brand;

    private OtoVinaxukiType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}