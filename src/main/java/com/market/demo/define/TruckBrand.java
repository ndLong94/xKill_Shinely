package com.market.demo.define;

public enum TruckBrand {
    HINO("Hino"),
    CHIEN_THANG("Chiến Thắng"),
    CUU_LONG("Cửu Long"),
    DAEWOO("Daewoo"),
    DONGBEN("Dongben"),
    DONGFENG("Dongfeng"),
    FAW("FAW"),
    FORCIA("Forcia"),
    FUSIN("Fusin"),
    FUSO("Fuso"),
    HOAMAI("Hoa Mai"),
    HOWO("Howo"),
    HYUNDAI("Hyundai"),
    ISUZU("Isuzu"),
    JAC("JAC"),
    KIA("KIA"),
    MITSUBISHI("Mitsubishi"),
    SAMCO("Samco"),
    SHACMAN("Shacman"),
    SINOTRUK("Sinotruk"),
    SUZUKI("Suzuki"),
    SYM("SYM"),
    TATA("TATA"),
    THACO("Thaco"),
    THANH_HUNG("Thành Hưng"),
    TMT("TMT"),
    TRUONG_GIANG("TRƯỜNG GIANG"),
    VINASUKI("Vinasuki"),
    VEAM("Veam"),
    OTHER("Hãng khác");
    
    
    private String brand;

    private TruckBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}