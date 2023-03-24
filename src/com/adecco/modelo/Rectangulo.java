package com.adecco.modelo;

public class Rectangulo extends Punto {
    private int base;
    private int altura;

    public double calcularArea(){
        return base*altura;
    }

    public Rectangulo(){}

    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
