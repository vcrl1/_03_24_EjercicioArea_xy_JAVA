package com.adecco.modelo;

public class Punto {
    //Atributos
    protected int x;
    protected int y;
    //Metodos

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //Constructores
    public Punto(){}
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Setters y Getters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
