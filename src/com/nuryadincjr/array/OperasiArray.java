package com.nuryadincjr.array;

import java.util.Arrays;

public class OperasiArray {
    /*
    Operasi Array: operasi aritmatika menggunakan library: 
    - import java.util.Arrays;
    melibatkan for loop, oprator relasional dan assignment.
    */

    public static void main(String[] args) {
        int[] scores = {100, 95, 80, 70, 75, 85, 80, 80, 92, 70};

        System.out.println("Scores: " + Arrays.toString(scores));

        // penjumlahan
        int total = 0;
        for(int val : scores) {
            total += val;
        }
        System.out.println("Sum of scores: " + total);
        
        // nilai max
        int max = 0;
        for(int val : scores) {
            if(max < val) {
                max = val;
            }
        }
        System.out.println("Max of scores: " + max);

        // nilai min
        int min = scores[0]; // min = 100
        for(int val : scores) {
            if(min > val) {
                min = val;
            }
        }
        System.out.println("Min of scores: " + min);
    }
}
