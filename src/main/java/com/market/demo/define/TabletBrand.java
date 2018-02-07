package com.market.demo.define;

public enum TabletBrand {
    APPLE("Apple"),
    ASUS("Asus"),
    LENOVO("Lenovo"),
    SAMSUNG("Samsung"),
    OTHER("Hãng khác");

    private String brand;

    private TabletBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}