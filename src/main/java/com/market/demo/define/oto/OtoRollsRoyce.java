package com.market.demo.define.oto;

public enum OtoRollsRoyce {
    GHOST("Ghost"),
    PARK_WARD("Park Ward"),
    PHANTOM("Phan Tom"),
    WRAITH("Wraith"),
    OTHER("Dòng khác");

    private String brand;

    private OtoRollsRoyce(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}