package com.market.demo.define.oto;

public enum Otosize {
    TWO("2"),
    FOUR("4"),
    FIVE("5"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    TWELVE("12"),
    FOURTEEN("14"),
    SIXTEEN("16"),
    OTHER("Khác");

    private String demand;

    private Otosize(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return demand;

    }
}