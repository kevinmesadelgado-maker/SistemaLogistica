package com.example;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Instanciación segura
        CamionDeReparto camion = new CamionDeReparto("CR001", 100, 500, true);
        BuqueCarga buque = new BuqueCarga("B001", 100, 2000, 50);

        //  Prueba de fuego (validación del setter)
        camion.setCombustible(-20);
        System.out.println("Combustible actual del camión: " + camion.getCombustible());

        // Lo volvemos a poner en 100
        camion.setCombustible(100);

        
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            System.out.println("Antes del viaje: " + t.getCombustible());
            t.viajar(100);
            System.out.println("Después del viaje: " + t.getCombustible());
            System.out.println("------------------------");
        }
    }
}