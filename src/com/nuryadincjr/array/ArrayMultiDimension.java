package com.nuryadincjr.array;

public class ArrayMultiDimension {
    /*
    Array Multdimensi atau Matriks: Array yang memiliki deret data dua dimensi atau lebih. 
    Jumlah [] menandakan banyak dimensi. 
    <type_data>[][] namaVariabel = new <type_data>[<jumlahKolom>][<jumlahBaris>]; 
    */

    public static void main(String[] args) {
        
        // deklarasi Array cara satu
        int[][] matrixA = {
            {3,4,5},
            {30,40,50},
            {3,4,5}
        };
        
        // deklarasi Array cara dua
        int[][] matrixB = {
            {5,4,3},
            {50,40,30},
            {5,4,3}
        };

        // menampung hail operasi aritmatika matrixA dan matrixB
        int[][] matrixC = new int[3][3];

        // proses operasi aritmatika matrixA dan matrixB
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {

                // menampung hasil ke matrixC
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        // menampilkan matrixA
        System.out.println("\nmatrixA");
        // proses operasi aritmatika matrixA dan matrixB
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {

                System.out.print(matrixA[i][j] + ",");
            }

            System.out.println();
        }
        
        // menampilkan matrixB
        System.out.println("\nmatrixB");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + ",");
            }

            System.out.println();
        }
        
        // menampilkan matrixC
        System.out.println("\nmatrixC");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrixC[i][j] + ",");
            }

            System.out.println();
        }
    }
}
