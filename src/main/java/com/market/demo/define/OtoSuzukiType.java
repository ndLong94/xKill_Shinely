package com.market.demo.define;

public enum OtoSuzukiType {
    AERIO("Aerio"),
    ALTO("Alto"),
    APV("APV"),
    BALENNO("Balenno"),
    CARRY("Carry"),
    CALERIO("Calerio"),
    CIAZ("Ciaz"),
    CULTIS_WAGON("Cultis Wagon"),
    ERTIGA("Ertiga"),
    GRAND_VITARA("Grand Vitara"),    
    LIANA("Liana"),
    SAMIRAI("Samirai"),
    SJ("SJ"),
    SUPER_CARRY_TRUCK("Super Carry Truck"),
    SUPER_CARRY_VAN("Super Carry Van"),
    OTHER("Dòng khác");

    private String brand;

    private OtoSuzukiType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}