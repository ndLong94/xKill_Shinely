package com.market.demo.define;

public enum OtoToyotaType {
    VIOS("Vios"), 
    FORTUNER("Fortuner"),
    INNOVA("Innova"), 
    CAMRY("Camry"),
    COROLLA_ALTIS("Corolla Altis"), 
    YARIS("Yaris"),
    LAND_CRUISER("Land Cruiser"),
    ZACE("Zace"), 
    _86("86"),    
    _4_RUNNER("4 Runner"), 
    ALLION("Allion"),
    ALPHARD("Alphard"), 
    ARISTO("Aristo"),
    AURION("Aurion"), 
    AVALON("Avalon"),
    AVANZA("Avanda"),
    AVENSIS("Avensis"), 
    AYGO("Aygo"),
    BREVIS("Brevis"), 
    CALDINA("Caldina"),
    CAMI("Cami"), 
    CARINA("Carina"),
    CELICA("Celica"), 
    CENTURY("Century"),    
    CHARSER("Charser"),
    COROLLA("Corolla"), 
    CORONA("Corona"),
    CRESSIDA("Cressida"),   
    CRESTA("Cresta"), 
    CROWN("Crown"),
    ESTIMA("Estima"), 
    FJ_CRUISER("FJ Cruiser"),
    HIACE("Hiace"), 
    HIGHLANDER("Highlander"),
    HILUX("Hilux"),
    IPSUM("Ipsum"), 
    IQ("IQ"),
    LITEACE("Liteace"),
    MARK_II("Mark II"), 
    MATRIX("Matrix"),    
    MEGA_CRUISER("Mega Cruiser"),
    MR_2("MR 2"), 
    PICNIC("Picnic"),
    PLATZ("PLATZ"),   
    PRADO("Prado"), 
    PREVIA("Previa"),
    PRIUS("Prius"), 
    PROGRES("Progres"),
    RAUM("Raum"), 
    RAV4("RAV4"),
    SEQUOIA("Sequoia"),
    SERA("Sera"), 
    SIENNA("Sienna"),
    SOARER("Soarer"),
    SOLARA("Solara"), 
    STARLET("Starlet"), 
    SUPRA("Supra"),
    TACOMA("Tacoma"), 
    TERCEL("Tercel"),
    TOWNACE("Townace"),   
    TUNDRA("Tundra"), 
    VENZA("Venza"),
    VEOSSA("Verossa"), 
    VISTA("Vista"),
    WIGO("Wigo"), 
    WISH("Wish"),
    XA("XA"),
    YARIS_VERSO("Yaris Verso"),     
    OTHER("Dòng khác");

    private String demand;

    private OtoToyotaType(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return demand;

    }
}