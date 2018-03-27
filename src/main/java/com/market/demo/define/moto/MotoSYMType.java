package com.market.demo.define.moto;

public enum MotoSYMType {
    ATTILA("Attila"), 
    SHARK("Shark"),
    WORF("Worf"),
    ELEGANT("Elegant"), 
    ANGELA("Angela"),
    GALAXY("Galaxy"),
    BONUS("Bonus"), 
    VENUS("Venus"),
    ACRUZO("Acruzo"),
    AMIGO("Amigo"), 
    CELLO("Cello"),
    ELITE("Elite"),
    ELIZEBETH("Elizabeth"), 
    ENJOY("Enjoy"),
    EZ("EZ"),
    FIDDLE("Fiddle"), 
    JOYRIDE("Joyride"),
    MAGIC("Magic"),
    SANDA_BOSS("Sanda_Boss"), 
    STAR("Star"),
    SYMPHONY("Symphony"),
    OTHER("Dòng khác");

    private String brand;

    private MotoSYMType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}