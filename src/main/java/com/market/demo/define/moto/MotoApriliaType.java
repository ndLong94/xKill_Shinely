package com.market.demo.define.moto;

public enum MotoApriliaType {
    _2015_RSV4_R_APRC_ABS("2015 RSV4 R APRC ABS"), 
    _2015_TUONO_R_APRC_ABS("2015 Tuono R APRC ABS"),
    CAPONORD_1200_ABS_RALLY("Caponord 1200 ABS Rally"),
    CAPONORD_1200_ABS_TRAVEL_PACK("Caponord 1200 ABS Travel Pack"), 
    DORSODURO_750_ABS("Dorsoduro 750 ABS"),
    RSV4_RF("RSV4 RF"),
    RSV4_RF_LE("RSV4 RF LE"), 
    RSV4_RR("RSV4 RR"),
    SHIVER_750("Shiver 750"),
    SR_MOTARD_50("SR MOTARD 50"), 
    TUONO_V4_1100_FACTORY_ABS("Tuono V4 1100 Factory ABS"),
    TUONO_V4_1100_RR_ABS("Tuono V4 1100 RR ABS"),
    OTHER("Dòng khác");

    private String brand;

    private MotoApriliaType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}