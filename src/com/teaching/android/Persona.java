package com.teaching.android;


public class Persona {
    private String nombre;
    private Float dinero;

    //Constructor
    public Persona(String nombre, float dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }
    public void pagar(Persona p, float cantidad) {
        this.dinero = this.dinero + cantidad;
        p.dinero = p.dinero - cantidad;
    }
    public float getDinero() {
        return dinero;
    }
}
