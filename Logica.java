public class Logica {
    /*
    Logika: Membandingkan dua buah statement kondisi, 
    (&& (and), || (or), ! (not/negasi)).
    */

    public static void main(String[] args) {
        int x = 10, y = 15;

        System.out.println((x == y) || (x != y)); // Result: false || ture = true
        System.out.println((x > y) && (x < y)); // Result: false && true = false
        System.out.println(!(x >= y)); // Result: true
    }
}
