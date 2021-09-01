package com.nuryadincjr.operator;

public class Aritmatika {
    /*
    Aritmatika: Operasi aritmatika
    (+, -, *, /, % (modulasi), ++ (Increment), -- (Decrement)).
    */
    public static void main(String[] args) {
        // declarated variabels
        int x = 10;
        int y = 15;
        int result = 0;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        result = x+y;
        System.out.println("x + y = " + result);
        
        result = x-y;
        System.out.println("x - y = " + result);
        
        result = x*y;
        System.out.println("x * y = " + result);
        
        result = x/y;
        System.out.println("x / y = " + result);
        
        result = x%y;
        System.out.println("x % y = " + result);
        
        x++;
        System.out.println("x++ = " + x);
        
        y--;
        System.out.println("x-- = " + y);
    }
}
