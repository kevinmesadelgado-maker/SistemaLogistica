package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque de carga " + getIdTransporte() + " está listo para descarga.");
    }

    public void mostrarDatos() {


        System.out.println("Capacidad de Carga: " + getCapacidadCarga());
        System.out.println("Cantidad de Contenedores: " + cantidadContenedores);
        System.out.println("Combustible actual: " + getCombustible());

        
        double precioPorUnidad = 5.0;

        double costoViaje = getCombustible() * precioPorUnidad;

        System.out.println("Costo de Viaje: USD " + costoViaje);
    }
}