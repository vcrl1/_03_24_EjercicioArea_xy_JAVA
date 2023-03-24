package com.adecco.modelo;

public class Circulo extends Punto {
    private double radio;
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
