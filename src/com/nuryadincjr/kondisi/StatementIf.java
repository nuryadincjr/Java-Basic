package com.nuryadincjr.kondisi;

public class StatementIf {
    /*
    Statemen If: Percabangan yang akan di eksekusi jika kondisi ekspresinya true.
    if (condition) {
        // statement aksi, ture
    } else {
        // statement default, false
    }
    */

    public static void main(String[] args) {
        int nilai = 10;
        int minimum = 15;

        if (nilai > minimum) {
            System.out.println("Nilai di atas rata-rata.");
        } else {
            System.out.println("Nilai di bawah rata-rata.");
        }
    }
}
