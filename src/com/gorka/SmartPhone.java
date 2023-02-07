package com.gorka;

public class SmartPhone extends SmartDevice {

    double size;
    boolean entradaJack;
    double megaPixels;
    boolean nfc;

    public SmartPhone(){

    }

    public SmartPhone(String nombre, String sistemaOperativo,
                      double pantalla, int memoriaRam,
                      int memoriaInterna, boolean tarjetaSd,
                      double size, boolean entradaJack,
                      double megaPixels, boolean nfc) {
        super(nombre, sistemaOperativo, pantalla, memoriaRam, memoriaInterna, tarjetaSd);
        this.size = size;
        this.entradaJack = entradaJack;
        this.megaPixels = megaPixels;
        this.nfc = nfc;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "Tamaño=" + size +
                ", entradaJack=" + entradaJack +
                ", megaPixels=" + megaPixels +
                ", nfc=" + nfc +
                ", nombre='" + nombre + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", pantalla=" + pantalla +
                ", memoriaRam=" + memoriaRam +
                ", memoriaInterna=" + memoriaInterna +
                ", tarjetaSd=" + tarjetaSd +
                '}';
    }
}
