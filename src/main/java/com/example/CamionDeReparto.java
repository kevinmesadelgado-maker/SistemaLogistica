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
            double nuevoCombustible = getCombustible() - unidadesConsumidas;
setCombustible(nuevoCombustible);
            this.setCombustible(nuevoCombustible);
        } else {
            int unidadesConsumidas = distancia / 10;
           double nuevoCombustible = getCombustible() - unidadesConsumidas;
setCombustible(nuevoCombustible);
            this.setCombustible(nuevoCombustible);
        }
        if (this.getCombustible() < 0) {
            this.setCombustible(0);
        }
        return this.getCombustible();
    }
}
