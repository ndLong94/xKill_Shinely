package com.market.demo.define.brand;

public enum Status {
    NEW("Còn mới"), 
    WARRANTY("Còn bảo hành"),
    OLD("Sản phẩm cũ");

    private String status;

    private Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;

    }
}