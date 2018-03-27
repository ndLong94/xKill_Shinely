package com.market.demo.define.brand;

public enum LaptopBrand {
    ACER("Acer"),
    APPLE("Apple"),
    ASUS("Asus"),
    DELL("Dell"),
    HP("HP"),
    LENOVO("Lenovo"),
    SAMSUNG("Samsung"),
    TOSHIBA("Toshiba"),
    SONY("Sony"),
    MSI("MSI"),
    OTHER("Hãng khác");

    private String brand;

    private LaptopBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}