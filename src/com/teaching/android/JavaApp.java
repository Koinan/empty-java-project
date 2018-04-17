package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int  valor = keyboard.nextInt();

    if (valor % 2 == 0) {
        System.out.print("es par");
    } else {
        System.out.print("es impar");
    }
    }
    }
