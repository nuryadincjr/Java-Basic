public class ForArray {
    /*
    For Array: Mencetak nilai Array secara eksplisit dan sederhana, 
    atau bisa menggunakan For loop. 
    Tipe data variabel pencacah sama dengan tipe data arraynya.
    Int[] array = {10, 20, 30, 40, 50};
    for(int a : array) {
        // statement aksi
    }
    */

    public static void main(String[] args) {
        int angka[] = {10, 20, 30, 40, 50};
        
        // use for
        // for(int i = 0; i < angka.length; i++) {
        //     System.out.println(angka[i]);
        // }

        for(int x : angka) {
            System.out.println(x);
        }
    }
}
