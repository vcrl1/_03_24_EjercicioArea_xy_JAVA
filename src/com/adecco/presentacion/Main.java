package com.adecco.presentacion;

import com.adecco.modelo.Circulo;
import com.adecco.modelo.Punto;
import com.adecco.modelo.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Punto p1= new Punto(0,1);
        System.out.println(p1.toString());
        Circulo c1= new Circulo(7);
        System.out.println("Área del círculo "+c1.calcularArea());
        Rectangulo r1= new Rectangulo(0,1,9,6);
        System.out.println("Área del rectángulo "+r1.calcularArea());
    }
}