package com.gorka;

public class SmartDevice {

    String nombre;
    String sistemaOperativo;
    double pantalla;
    int memoriaRam;
    int memoriaInterna;
    boolean tarjetaSd;

    public SmartDevice(){

    }

    public SmartDevice(String nombre, String sistemaOperativo,
                       double pantalla, int memoriaRam,
                       int memoriaInterna, boolean tarjetaSd){
        this.nombre = nombre;
        this.sistemaOperativo = sistemaOperativo;
        this.pantalla = pantalla;
        this.memoriaRam = memoriaRam;
        this.memoriaInterna = memoriaInterna;
        this.tarjetaSd = tarjetaSd;
    }


    @Override
    public String toString() {
        return "SmartDevice{" +
                "nombre='" + nombre + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", pantalla=" + pantalla +
                ", memoriaRam=" + memoriaRam +
                ", memoriaInterna=" + memoriaInterna +
                ", tarjetaSd=" + tarjetaSd +
                '}';
    }
}
