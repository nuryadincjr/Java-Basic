public class DoWhileLoop {
    /*
    Statemen Do While: Pengecekan kondisi diakhir, statemen akan dieksekusi minimal sekali, jika bernilai true maka pernyataan dilakukan pengulangan.
    do{
        // statement aksi disertai iterasi
    }while(condition);
    */

    public static void main(String[] args) {
        int x = 0;

        do {
            System.out.println(x); x++;
        } while(x < 10);
    }
}
