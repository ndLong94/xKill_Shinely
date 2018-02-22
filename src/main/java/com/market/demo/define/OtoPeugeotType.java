package com.market.demo.define;

public enum OtoPeugeotType {
    _107("107"),
    _205("205"),
    _206("206"),
    _207("207"),
    _208("208"),
    _305("305"),
    _306("306"),
    _307("307"),
    _308("308"),
    _309("309"),    
    _404("404"),
    _405("405"),
    _406("406"),
    _408("408"),
    _505("505"),
    _508("508"),
    _605("605"),
    _607("607"),
    _3008("3008"),
    _5008("5008"),
    BOXER("Boxer"),    
    J5("J5"),
    _RCZ("RCZ"),
    OTHER("Dòng khác");

    private String brand;

    private OtoPeugeotType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}