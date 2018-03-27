package com.market.demo.define.oto;

public enum OtoFordType {
    RANGER("Ranger"), 
    ECOSPORT("EcoSport"),
    EVEREST("Everest"), 
    FOCUS("Focus"),
    TRANSIT("Transit"), 
    ESCAPE("Escape"),
    LASER("Laser"),
    FIESTA("Fiesta"), 
    ACONONLINE("Acononline"),    
    AEROSTAR("Aerostar"), 
    ASPIRE("Aspire"),
    BRONCO("Bronco"), 
    CAPRI("Capri"),
    CARAVAN("Caravan"), 
    CARGO("Cargo"),
    CLUB_WAGON("Club Wagon"),
    CONTOUR("Contour"), 
    COURIER("Courier"),
    CROWN_VICTORIA("Crown Victoria"), 
    EDGE("Edge"),
    ESCORT("Escort"), 
    ESPEDITION("Espedition "),
    EXPLORER("Explorer"), 
    EXPRESS("Express"),
    F_150("F 150"),
    F_350("F 350"), 
    F_700("F 700"),
    FLEX("Flex"),   
    FOCUS_C_MAX("Focus C Max"), 
    FUCION("Fucion"),
    GALAXIE("Galaxie"), 
    KA("Ka"),
    MAVERICK("Maverick"), 
    MONDEO("Mondeo"),
    MUSTANG("Mustang"),
    ORION("Orion"), 
    PROBE("Probe"),
    PUMA("Puma"),
    SIERRA("Sierra"), 
    TAURUS("Taurus"),
    TEMPO("Tempo"),
    WIND_STAR("Wind Star"),
    OTHER("Dòng khác");

    private String demand;

    private OtoFordType(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return demand;

    }
}