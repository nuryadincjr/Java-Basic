package com.nuryadincjr.kondisi;

class StatementIfElseIf{
    /*
    Statemen If Else If: Multi percabangan, dieksekusi jika ekspresinya true, jika tidak ke else.
    if (condition1) {
    // statement aksi1
    } else if (condition2) {
        // statement aksi2 dieksekusi jika condition1 false
    } else {
        // statement default dieksekusi jika condition1 dan 2 false
    }
    */

    public static void main(String[] args) {
        int nilai = 75, skbm = 75;

        if(nilai > skbm) {
            System.out.println("Nilai di atas rata-rata");
        } else if (nilai == skbm) {
            System.out.println("Nilai pas dengan rata-rata");
        } else {
            System.out.println("Nilai dibawah rata-rata");
        }
    }
}