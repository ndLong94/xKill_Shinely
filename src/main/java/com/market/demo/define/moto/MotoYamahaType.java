package com.market.demo.define.moto;

public enum MotoYamahaType {
    EXCITER("Exciter"), 
    SIRIUS("Sirius"),
    YAMAHA_R("Yamaha_R"),
    NVX("Nvx"), 
    JANUS("Janus"),
    NOUVO("Nouvo"),
    GRANDE("Grande"), 
    NOZZA("Nozza"),
    ACRUZO("Winner"),
    CUXI("Cuxi"), 
    FZ("FZ"),
    JUPITER("Jupiter"),
    LUVIAS("Luvias"), 
    MIO("Mio"),
    MT("MT"),
    NM_X("NM-X"), 
    R("R"),
    TAURUS("Taurus"),
    TFX("TFX"), 
    YASS("Yass"),
    YAZ("YAZ"),
    YZF("YZF"),
    OTHER("Dòng khác");

    private String brand;

    private MotoYamahaType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;

    }
}