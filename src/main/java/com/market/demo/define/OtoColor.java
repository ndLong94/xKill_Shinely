package com.market.demo.define;

public enum OtoColor {
    WHITE("Trắng"),
    BLACK("Đen"),
    SILVER("Bạc"),
    ORANGE("Cam"),
    RED("Đỏ"),
    BLUE("Xanh dương"),
    YELLOW("Vàng"),
    GREEN("Xanh lá"),
    PINK("Hồng"),
    GRAY("Xám"),
    BROWN("Nâu"),
    OTHER("Màu khác");

    private String brand;

    private OtoColor(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}