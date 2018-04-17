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


        do   {
        if (valor > random) {
            System.out.println("menor");
        } else if (valor < random) {
            System.out.println("mayor");
        } else {
            System.out.println("has ganado");
            }
            valor = keyboard.nextInt();
        }
        while (valor != random);
        System.out.println("Has ganado");


    }
}
