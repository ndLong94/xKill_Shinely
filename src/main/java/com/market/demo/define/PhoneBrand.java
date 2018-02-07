package com.market.demo.define;

public enum PhoneBrand {
    APPLE("Apple"),
    ASUS("Asus"),
    LENOVO("Lenovo"),
    SAMSUNG("Samsung"),
    BLACKBERRY("Blackberry"),
    HTC("HTC"),
    HUAWEI("Huawei"),
    LG("LG"),
    MOBIISTAR("Mobiistar"),
    NOKIA_SMARTPHONE("Nokia thông minh"),
    NOKIA_OLD("Nokia phổ thông"),
    OPPO("Oppo"),
    VIVO("Vivo"),
    SKY("Sky"),
    SONY("Sony"),
    XIAOMI("Xiaomi"),
    MASSTEL("MASSTEL"),
    LANDROVER("LAND ROVER"), 
    OTHER("Hãng khác");

    private String brand;

    private PhoneBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}