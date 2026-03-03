package com.example;

public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }
    public Transporte() {
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public double combustible() {
        return combustible;
    }

    public double getCombustible() {
        return combustible;
    }

    public double setCombustible(double nivel) {
        if (nivel < 0) {
            nivel = 0;
        } else if (nivel > 100) {
            nivel = 100;
        }
        this.combustible = nivel;
        return this.combustible;
    }

    public double capacidadCarga() {
        return capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public double setCapacidadCarga(double capacidadCarga) {
        if (capacidadCarga < 0) {
            throw new IllegalArgumentException("La capacidad de carga no puede ser negativa");
        }
        this.capacidadCarga = capacidadCarga;
        return capacidadCarga;
    }

    public double viajar(int distancia) {
        if (distancia < 0) {
            throw new IllegalArgumentException("La distancia no puede ser negativa");
        }
        int unidadesConsumidas = distancia / 10;
        double nuevoCombustible = this.combustible - unidadesConsumidas;
        if (nuevoCombustible < 0) {
            this.combustible = 0;
        } else {
            this.combustible = nuevoCombustible;
        }
        return this.combustible;
    }
 @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Transporte [idTransporte= " + idTransporte + ", combustible= " + combustible + ", capacidadCarga= " + capacidadCarga + "]";
    }
}