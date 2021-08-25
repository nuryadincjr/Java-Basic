public class Lingkaran {
    // Constanta
    /*
    Mirip variable, namun berisi data yang sudah diinisialisasi dan pasti (constant), dan nilainya tidak bisa ditimpa.
    •	Penamaan deklarasi variable diusahakan Upercase.
    •	dideklarasikan menggunakan keyword final.
    •	Pendeklarasian: static  final <type_data> NAMA_PARIABLE = <value>;
    */

    static int radius;
    static final double PI = 3.14;

    public static void main(String[] args) {
        radius = 7;
        // PI = 3.23; can't replace the value
        double luas = (radius * radius * PI);

        System.out.println("Jari-jari\t: " + radius);
        System.out.println("Luas\t\t: " + luas);
    }
}
