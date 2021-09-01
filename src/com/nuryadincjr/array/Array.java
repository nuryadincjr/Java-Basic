package com.nuryadincjr.array;

public class Array {
    /*
    Array di Java: Type variabel yang dapat menyimpan lebih dari satu nilai dalam satu variable. 
    Dengan pleksibelitas pencarian dan pencetakan data.
    <type_data>[] namaVariabel = new <type_data>[<jumlahData>]; 
    atau langsung menginisialisasi nilai:
    <type_data>[] namaVariabel = {data1, data2, …};
    */

    public static void main(String[] args) {
        // first step
        // String[] animals = new String[3];
        // animals[0] = "cicken";
        // animals[1] = "cow";
        // animals[2] = "horse";

        // second step
        String[] animals = {"cicken", "cow", "horse"};

        System.out.println(animals[2]);
    }
}
