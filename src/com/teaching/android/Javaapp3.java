package com.teaching.android;

public class Javaapp3 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo (5, 2,3);
        double Area = c1.getArea(5);
        double Circumferencia = c1.getCircumference(5);

        System.out.println(Area);
        System.out.println(Circumferencia);
        System.out.println(c1);
    }
}
