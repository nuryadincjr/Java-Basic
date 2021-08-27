import java.util.Arrays;

public class PrintArray {
    /*
    Mencetak Array: menampilkan isi dari Array menggunakan Method toString(). 
    Dengan nilai kembalian dalam bentuk string, 
    dan harus menginport library: import java.util.Arrays;
    - String[] namaVariabel = {data1, data2, …};
    - System.out.println(Arrays.toString(namaVariabel));
    Menampilkan isi aray multidimensi dengan Method deepToString(), 
    berguna untuk debaging.
    - Arrays.deepToString();
    */

    public static void main(String[] args) {
        String[] satuDimensi = {"kangkung", "bayam", "brokoli"};
        String[][] multiDimensi = {
            {"mangga", "melon"}, 
            {"senangka", "jambu"}
        };

        System.out.println(Arrays.toString(satuDimensi));
        System.out.println(Arrays.deepToString(multiDimensi));
    }
}