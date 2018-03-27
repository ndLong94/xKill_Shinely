package com.market.demo.define.brand;

public enum OtoBrand {
    KIA("Kia"),
    TOYOTA("Toyota"),
    FORD("Ford"),
    CHEVROLET("Chevrolet"),
    HYUNDAI("Hyundai"),
    HONDA("Honda"),
    MAZDA("Mazda"),
    MITSUBISHI("Mitsubishi"),
    ACURA("Acura"),
    ALFA_ROMERO("Alfa Romero"),
    ASIA("Asia"),
    ASTON_MARTIN("Aston Martin"),
    AUDI("Audi"),
    BAIC("Baic"),
    BENTLEY("Bentley"),
    BMW("BMW"),
    BUICK("Buick"),
    BYD("BYD"),
    CADILLAC("Cadillac"),
    CHANGAN("Changan"),
    CHERY("Chery"),
    CHRYSLER("Chrysler"),
    CITROEN("Citroen"),
    DAEWOO("Daewoo"),
    DAIHATSU("Daihatsu"),
    DODGE("Dodge"),
    FERRARI("Ferrari"),
    FIAT("Fiat"),
    FUSO("Fuso"),
    GAZ("Gaz"),
    GEELY("Geely"),
    GMC("GMC"),
    HAIMA("Haima"),
    HYNO("Hyno"),
    HUMMER("Hummer"),
    INFINITI("Infiniti"),
    ISUZU("Isuzu"),
    JAGUAR("Jaguar"),
    JEEP("Jeep"),
    LADA("Lada"),
    LAMBORGHINI("Lamborghini"),
    LANDROVER("LandRover"),
    LEXUS("Lexus"),
    LIFAN("Lifan"),
    LINCOLN("Lincoln"),
    LUXGEN("Luxgen"),
    MAN("man"),
    MASERATI("Maserati"),
    MAYBACK("Mayback"),
    MEKONG("Mekong"),
    MERCEDES_BENZ("Mercedes Benz"),
    MERCURY("Mercury"),
    MG("MG"),
    MINI("Mini"),
    NISSAL("Nissal"),
    OPEL("Opel"),
    PEUGEOT("Peugeot"),
    PONTIAC("Pontiac"),
    PORSCHE("Porsche"),
    PROTON("Proton"),
    RENAULT("Renault"),
    ROLLS_ROYCE("Rolls Royce"),
    ROVER("Rover"),
    SAMSUNG("Samsung"),
    SCION("Scion"),
    SMART("Smart"),
    SSANGYONG("Ssangyong"),
    SUBARU("Subaru"),
    SUZUKI("Suzuki"),
    SYM("SYM"),
    TESLA("Tesla"),
    THACO("Thaco"),
    UAZ("UAZ"),
    VINASUKI("Vinasuki"),
    VOLKSWAGEN("Volkswagen"),
    VOLVO("Volvo"),
    ZOTYE("Zotye"),        
    OTHER("Hãng khác");
    
    private String brand;

    private OtoBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}