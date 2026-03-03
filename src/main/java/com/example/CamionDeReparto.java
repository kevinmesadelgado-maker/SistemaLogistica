package com.example;

public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public double viajar(int distancia) {
        if (distancia < 0) {
            throw new IllegalArgumentException("La distancia no puede ser negativa");
        }
        if (tieneRefrigeracion == true) {
            int unidadesConsumidas = distancia / 5;
            double nuevoCombustible = this.combustible() - unidadesConsumidas;
            this.setCombustible(nuevoCombustible);
        } else {
            int unidadesConsumidas = distancia / 10;
            double nuevoCombustible = this.combustible() - unidadesConsumidas;
            this.setCombustible(nuevoCombustible);
        }
        if (this.combustible() < 0) {
            this.setCombustible(0);
        }
        return this.combustible();
    }
}
