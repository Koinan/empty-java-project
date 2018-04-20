package com.teaching.android;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //Crear Matriz
        private int size = 3;
        private int [][] matriz = new int [size][size];
        private int [] vector = {3,2,1,1,2,3,2,3,1};


        int indice = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = vector [indice++];
            }
        }

        System.out.println();

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.print("\n");
                }
        /*
        //Imprimir matrices

        System.out.print("[" + matriz [0][0] + " ");
        System.out.print(matriz [0][1] + " ");
        System.out.println(matriz [0][2] + "]") ;
        System.out.print("[" + matriz [1][0] + " ");
        System.out.print(matriz [1][1] + " ");
        System.out.println(matriz [1][2] + "]");
        System.out.print("[" + matriz [2][0] + " ");
        System.out.print(matriz [2][1] + " ");
        System.out.print(matriz [2][2] + "]");
         */


    }
}
