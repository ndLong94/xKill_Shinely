package com.market.demo.define;

public enum Demand {
    BUY("buy"), 
    SELL("sell");

    private String demand;

    private Demand(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return demand;

    }
}