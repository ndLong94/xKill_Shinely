package com.market.demo.define.moto;

public enum MotoKymcoType {
    CANDY_Hi("Candy Hi"), 
    CANDY_S("Candy S"),
    JOCKEY_Fi("Jockey Fi"),
    K_PIPE("K-Pipe"), 
    LIKE_Fi("Like Fi"),
    LIKE_MMC("Like MMC"),
    MANY("Many"), 
    PEOPLE_16_Fi("People 16 Fi"),
    PEOPLE_16_S("People 16 S"),
    OTHER("Dòng khác");

    private String brand;

    private MotoKymcoType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}