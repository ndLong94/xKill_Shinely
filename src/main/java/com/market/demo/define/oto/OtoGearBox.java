package com.market.demo.define.oto;

public enum OtoGearBox {
	AUTO_TRANSMISSION("Tự động"),
    MANUAL_TRANSMISSION("Số sàn"),
    AUTO_AND_MANUAL_TRANSMISSION("Cả hai");

    private String demand;

    private OtoGearBox(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return demand;

    }
}