package com.nuryadincjr.perulangan;

public class ContinueLoop {
    /*
    Statemen Continue: keyword continue; 
    memaksa memulai statement dari awal loop.
    */

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {

            // statement bilangan bulat akan di skip:
            if(i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
