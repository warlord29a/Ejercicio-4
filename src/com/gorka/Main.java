package com.gorka;

public class Main {

    public static void main(String[] args) {
        SmartWatch reloj1 = new SmartWatch("Casio", "IOS", 5.8,8, 1024, false, false, "goma negra", "Plástico barato", true, true, false, false);
        SmartPhone tlf1 = new SmartPhone("Xiaomi", "Android", 5.8,8, 1024, true, 17, false, 64, false);
        System.out.println(reloj1);
        System.out.println(tlf1);
    }
}
