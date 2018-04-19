package com.teaching.android;

public class Punto {
    private int x;
    private int y;

    public Punto() {
    }
    public Punto(int px, int py) {
        this.x = px;
        this.y = py;
    }

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
    public double distancia (int px, int py) {
        int diferenciaX = (px - x);
        int diferenciaY = (py - y);
        double diferenciaXelevado = Math.pow(diferenciaX, 2);
        double diferenciaYelevado = Math.pow(diferenciaY, 2 );
        double suma= diferenciaXelevado + diferenciaYelevado;
        double resultado = Math.sqrt(suma);
        return resultado;

    }
    public double distancia(Punto p) {
        double resultado = distancia (p.x, p.y);
        return resultado;
        /*
        metodo largo
        int diferenciaX = (p.x - x);
        int diferenciaY = (p.y - y);
        double diferenciaXelevado = Math.pow(diferenciaX, 2);
        double diferenciaYelevado = Math.pow(diferenciaY, 2 );
        double suma= diferenciaXelevado + diferenciaYelevado;
        double resultado = Math.sqrt(suma);
        return resultado;
         */
    }

    public String toString() {
        return "punto (" + x + "," + y + ")";

    }
}
