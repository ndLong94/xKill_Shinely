package com.market.demo.define;

public enum OtoVolkswagenType {
    BEETLE("Beetle"),
    BORA("Bora"),
    CALIFORNIA("California"),
    EOS("Eos"),
    GOLF("Golf"),
    JETTA("Jetta"),
    MULTIVAN("Multivan"),
    NEW_BEETLE("New Beetle"),
    PASSAT("Passat"),    
    PHAETON("Phaeton"),
    POLO("Polo"),
    ROUTAN("Routan"),
    SCIROCCO("Scirocco"),
    SHARAN("Sharan"),
    SOLO("Solo"),
    TIGUAN("Tiguan"),
    TOUAREG("Touareg"),
    TRANSORTER("Transporter"),    
    VENTO("Vento"),
    OTHER("Dòng khác");

    private String brand;

    private OtoVolkswagenType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}