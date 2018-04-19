package com.teaching.android;

public class Circulo {
    private Punto centro;
    private int radio;

    public Circulo() {

    }
    public Circulo(int radio, int x, int y) {
        this.radio = radio;
        this.centro = new Punto(x,y);

    }
    public Circulo(Punto p , int radio) {
        this.radio = radio;
        this.centro = p;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double getArea (int radio) {
    double Area = Math.PI * Math.pow(radio, 2);
    return Area;
    }

    public double getCircumference(int radio) {
        double Circumferencia = Math.PI * Math.pow(radio, 2);
        return Circumferencia;

    }

    public String toString() {
        return "Círculo con centro en " + centro +  " y radio " + radio + " ";
    }
}
