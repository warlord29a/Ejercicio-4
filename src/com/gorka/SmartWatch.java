package com.gorka;

public class SmartWatch extends SmartDevice {

    boolean botones;
    String correa;
    String material;
    boolean pulsaciones;
    boolean tensiometro;
    boolean speaker;
    boolean microSim;

    public SmartWatch(String nombre, String sistemaOperativo,
                      double pantalla, int memoriaRam,
                      int memoriaInterna, boolean tarjetaSd,
                      boolean botones, String correa,
                      String material, boolean pulsaciones,
                      boolean tensiometro, boolean speaker, boolean microSim) {
        super(nombre, sistemaOperativo, pantalla, memoriaRam, memoriaInterna, tarjetaSd);
        this.botones = botones;
        this.correa = correa;
        this.material = material;
        this.pulsaciones = pulsaciones;
        this.tensiometro = tensiometro;
        this.speaker = speaker;
        this.microSim = microSim;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "botones=" + botones +
                ", correa='" + correa + '\'' +
                ", material='" + material + '\'' +
                ", pulsaciones=" + pulsaciones +
                ", tensiometro=" + tensiometro +
                ", speaker=" + speaker +
                ", microSim=" + microSim +
                ", nombre='" + nombre + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", pantalla=" + pantalla +
                ", memoriaRam=" + memoriaRam +
                ", memoriaInterna=" + memoriaInterna +
                ", tarjetaSd=" + tarjetaSd +
                '}';
    }
}
