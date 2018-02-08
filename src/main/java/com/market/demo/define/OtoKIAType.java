package com.market.demo.define;

public enum OtoKIAType {
    MORNING("Morning"), 
    RIO("Rio"),
    K3("K3"), 
    CERATO("Cerato"),
    FORTE("Forte"), 
    SEDONA("Sedona"),
    RONDO("Rondo"),
    CARENS("Carens"), 
    AVELLA("Avella"),    
    BONGO("bongo"), 
    CADENZA("Cadenza"),
    CARNIVAL("Carnival"), 
    CD5("CD5"),
    CLARUS("Clarus"), 
    CONCORD("Concord"),
    ENTERPRISE("Enterprise"),
    FRONTIER("Frontier"), 
    JEEP("Jeep"),
    JOICE("Joice"), 
    K2700("K2700"),
    K3000S("K3000S"), 
    K5("K5"),
    K7("K7"), 
    LOTZE("Lotze"),
    MAGENTIS("Magentis"),
    OPIRUS("Opirus"), 
    OPTIMA("Jeep"),
    PICANTO("Picanto"),   
    POTENTIA("Potentia"), 
    PREGIO("Pregio"),
    PRIDE("Pride"), 
    RAY("Ray"),
    RETONA("Retona"), 
    ROADSTER("Roadster"),
    SEPHIA("Sephia"),
    SORENTO("Sorento"), 
    SOUL("Soul"),
    SPECTRA("Spectra"),
    SPORTAGE("Sportage"), 
    VISTO("Visto"),
    OTHER("Dòng khác");

    private String demand;

    private OtoKIAType(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return demand;

    }
}