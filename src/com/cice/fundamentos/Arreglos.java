package com.cice.fundamentos;

public class Arreglos {

    int[] numeros = new int[50];
    static int[] otrosNumeros = {1,2,3,4,5};

    public static void main(String[] args) {

        System.out.println(otrosNumeros[1]);

        otrosNumeros[1] = 3;

        System.out.println(otrosNumeros[1]);

        int size = otrosNumeros.length;

        System.out.println(size);

        //Arrays de Varias Dimensiones

        int[][] arrayBidimensional = new int[2][4]; //el 2 es el número de arrays, el 4 los valores
        int array2b[][] = {{0,1,2,3},{2,1,5,4}};

        int[][][] array3d = new int[2][2][2];
        int[][][] array3d2 ={{{1,2},{2,4}},{{5,4},{8,4}}};

    }
}
