package com.market.demo.define;

public enum OtoNissanType {
    _100NX("100NX"),
    _200SX("200SX"),
    _240SX("240SX"),
    _300ZX("300ZX"),
    _350Z("350Z"),
    _370Z("370Z"),
    ALTIMA("Altima"),
    AVENIR("Avenir"),
    BLUEBIRD("Bluebird"),    
    CEDRIC("Cedric"),
    CEFIRO("Cefiro"),
    CIMA("Cima"),
    ELGRAND("Elgrand"),
    FRONTIER("Frontier"),
    GLORIA("Gloria"),
    GRAND_LIVINA("Grand Livina"),
    GT_R("GT R"),
    JUKE("Juke"),
    LAGO("Lago"),
    LAUREL("Laurel"),
    LEAF("Leaf"),
    LIBERTY("Liberty"),
    LIVINA("Livina"),
    MAXIMA("Maxima"),
    MICRA("Micra"),
    MOCO("Moco"),
    MURANO("Murano"),
    NAVARA("Navara"),
    NV("NV"),
    PATHFINDER("Pathfinder"),
    PATROL("Patrol"),
    PICK_UP("Pick up"),
    PIXO("Pixo"),
    PRAIRIE("Prairie"),   
    PRESAGE("Presage"),
    PRESIDENT("President"),
    PRIMASTAR("Primaster"),    
    PRIMERA("Primera"),
    PULSAR("Pulsar"),
    QASHQAI("QashQai"),
    QUEST("Quest"),
    RASHEEN("Rasheen"),
    ROGUE("Rogue"),
    SAFARI("Safari"),
    SENTRA("Sentra"),
    SERENA("Serena"),
    SILVIA("Silvia"),
    SKYLINE("Skyline"),
    STAGEA("Stagea"),
    SUNNY("Sunny"),
    TEANA("Teana"),
    TERRANO("Terrano"),
    TIIDA("Tiida"),
    TINO("Tino"),
    URVAN("Urvan"),
    VANETTE("Vanette"),
    X_TERRA("X Terra"),
    X_TRAIL("X Trail"),
    OTHER("Hãng khác");

    private String brand;

    private OtoNissanType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}