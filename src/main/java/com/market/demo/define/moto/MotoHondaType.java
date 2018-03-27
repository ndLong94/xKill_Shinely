package com.market.demo.define.moto;

public enum MotoHondaType {
    VISION("Vission"), 
    AIR_BLADE("Air Blade"),
    LEAD("Lead"),
    DREAM("Dream"), 
    _67("67"),
    _A("@"),
    SH("SH"), 
    WAVE("Wave"),
    WINNER("Winner"),
    SH_MODE("SH Mode"), 
    AVITOR("Avitor"),
    BLADE("Blade"),
    CB("CB"), 
    CBR("CBR"),
    CD("CD"),
    CHALY("Chaly"), 
    CITY("City"),
    CLICK("Click"),
    CUB("Cub"), 
    DYLAN("Dylan"),
    FUTURE("Future"),
    MSX_125("MSX 125"), 
    NOVA("Nova"),
    PCX("PCX"),
    PS("PS"), 
    REBEL("Rebel"),
    SCOOPY("Scoopy"),
    SCR("SCR"), 
    SPACY("Spacy"),
    WIN("Win"),
    OTHER("Dòng khác");

    private String brand;

    private MotoHondaType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}