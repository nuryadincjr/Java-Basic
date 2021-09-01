package com.nuryadincjr.perulangan;

public class BreakLoop {
    /*
    Statemen Break: keyword break; 
    memaksa keluar dari sebuah statemen loop.
    */

    public static void main(String[] args) {
        String[] sayuran = {
            "bayam", "kangkung", "tomat", 
            "mentimun", "selada", "brokoli"
        };

        System.out.println("Mencari tomat di array sayuran");

        for(String sayut : sayuran) {
            System.out.println(sayut);

            if(sayut == "tomat") {
                System.out.println("Tomat ketemu!");
                break;
            }
        }
    }
}
