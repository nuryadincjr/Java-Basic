package com.nuryadincjr.operator;

public class Assignment {
    /*
    Penugasan(Assignment): Menetapkan tugas atau nilai pada variabel itu sendiri,
    (=, +=, -=, *=, /=, %=).
    */

    public static void main(String[] args) {
        int x = 10, y = 15;

        x += y; // x + y = x
        System.out.println(x); // Result: 25
        
        x -= y; // x - y = x
        System.out.println(x); // Result: 10
        
        x *= y; // x * y = x
        System.out.println(x); // Result: 150
        
        x /= y; // x / y = x
        System.out.println(x); // Result: 10
        
        x %= y; // x % y = x
        System.out.println(x); // Result: 10
    }
}
