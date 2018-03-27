package com.market.demo.define;

public enum OtoVolvoType {
	_340("340"),
    _360("360"),
    _460("460"),
    _740("740"),
    _760("760"),
    _850("850"),
    _940("940"),
    _960("960"),
    C70("C70"),
    S60("S60"),    
    S90("S90"),
    V70("V70"),
    XC60("XC60"),
    XC90("XC90"),
    OTHER("Dòng khác");

    private String brand;

    private OtoVolvoType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}