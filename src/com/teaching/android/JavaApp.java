package com.teaching.android;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {
    public static void main(String[] args) {
        Persona p1 = new Persona( "Messi", 100f);
        Persona p2 = new Persona( "Ronaldo", 500f);
        p1.pagar(p2, 400f);
        System.out.println("Ronaldo tiene " + p2.getDinero());
        System.out.println("Messi tiene " + p1.getDinero());
    }
}

