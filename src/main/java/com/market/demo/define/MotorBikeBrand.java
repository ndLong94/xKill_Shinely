package com.market.demo.define;

public enum MotorBikeBrand {
    HONDA("Honda"),
    YAMAHA("Yamaha"),
    PIAGGIO("Piaggio"),
    SUZUKI("Suzuki"),
    SYM("SYM"),
    APRILIA("Aprilia"),
    BAZAN("Bazan"),
    BENELLY("Benelly"),
    BWM("BWM"),
    BRIXTON("Brixton"),    
    DUCATI("Ducati"),
    EURO_REIBEL("Euro Reibel"),
    HALIM("Halim"),
    HARLEY_DAVIDSON("Harley Davidson"),
    HYOSUNG("Hyosung"),
    KAWASAKI("Kawasaki"),
    KEEWAY("Keeway"),
    KENGO("Kengo"),
    KTM("KTM"),
    KYMCO("Kymco"),
    LAMBRETTA("Lambretta"),
    MALAGUTI("Malaguti"),
    MOTO_GUZZI("Moto Guzzi"),
    MV_AGUSTA("MV Agusta"),
    NORTON("Norton"),
    PEUGEOT("Peugeot"),
    REBELUSA("RebelUSA"),
    REGAL_RAPTOR("Regal Raptor"),
    SACHS("Sachs"),
    SANDA("Sanda"),
    TRIUMPH("Triumph"),
    VENTO("Vento"),
    Victory("Victory"),
    VISITOR("Regal Raptor"),
    DAELIM("Daelim"),
    OTHER("Other");

    private String brand;

    private MotorBikeBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}