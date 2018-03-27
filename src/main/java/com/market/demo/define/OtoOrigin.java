package com.market.demo.define;

public enum OtoOrigin {
    VIETNAM("Việt Nam"), 
    INDIA("Ấn Độ"),
    KOREA("Hàn Quốc"), 
    THAILAND("Thái Lan"),
    JAPAN("Nhật Bản"), 
    CHINA("Trung Quốc"),
    USA("Mỹ"),
    GERMANY("Đức"), 
    TAIWAN("Đài Loan"),
    OTHER("Nước khác");

    private String demand;

    private OtoOrigin(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return demand;

    }
}