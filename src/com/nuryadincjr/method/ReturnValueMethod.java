package com.nuryadincjr.method;

public class ReturnValueMethod {
    /*
    Return Value Method: mengembalikan nilai dari dalam method. 
    Deklarasi type data pada metod harus sama dengan nilai return method tersebut.
    Standar type, return: nilai dari tipe standar Java.
    Object, return, nilai objek yang sesuai dengan class tertentu.
    Array, return: nilai array dengan tipe data tertentu.
    */

    static int tambah(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(tambah(10, 40));
    }
}
