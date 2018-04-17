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
        int a = 0;
        do   {
            if (valor > random) {
                System.out.println("Es menor");
                a++;
            } else if (valor < random) {
                System.out.println("Es mayor");
                a++;
            } else if (a > 3) {
                    System.out.println("Juego terminado, has perdido");
                    break;
            } else {
                System.out.println("Has ganado");
            }
            valor = keyboard.nextInt();
        }
        while (valor != random || a != 3);
        }


    }
