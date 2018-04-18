package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        Random generator = new Random();
        int random = generator.nextInt(10) + 1;

    Scanner keyboard = new Scanner(System.in);
    int  valor = keyboard.nextInt();
    int fail = 0;


        do   {
        if (valor > random) {
            System.out.println("menor");
            fail++;
        } else if (valor < random) {
            System.out.println("mayor");
            fail++;
        } else if (valor == random) {
            System.out.println("has ganado");
            System.exit(0);
        }
            valor = keyboard.nextInt();

        }
        while (fail < 2);
        System.out.println("  3 intentos usados" );


    }
}
