package com.teaching.android;

public class Matriz {

    private int size;
    private int vector;

    public Matriz(int size, int vector) {
        this.size = size;
        this.vector = vector;

    }

    public void asignarDatos(int[] vector) {
        int indice = 0;
        int [][] matriz = new int [size][size];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = vector [indice++];
            }
        }

    }

    public void suma(Matriz m) {

    }

    public void mostrar() {
        System.out.println();
    }
}

