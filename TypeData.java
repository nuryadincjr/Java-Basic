public class TypeData {
    // Tipe Data
    /*
    Jenis data yang tersimpan dalam variabel.
    •	byte(angka bulat, rentang -128 sampai 127);
    •	short (angka bulat, rentang -32.767 sampai 32.767);
    •	int (angka bulat, rentang -2.147.483.648 sampai 2.147.483.647);
    •	long (angka bulat, rentang -9.223.372.036.854.775.808 sampai -9.223.372.036.854.775.807);
    •	float (bilangn desimal, rentang 32-bit IEEE 754 FP);
    •	double (bilangan desimal, rentang 64-bit IEE 754 FP);
    •	boolean (1 bit-True/false)
    •	char (alfanumerik, diapit dengan tanda petik satu <’>).
    •	String (rangkaian alfanumerik dan tandabaca, diapit dengan tanda petik dua <“>);
    */

    public static void main(String[] args) {
        byte x = 100;
        short y = 1000;
        int z = 1000000;
        double pi = 3.14;
        String name = "Nuryadin Abutani";
        char value = 'N';

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(pi);
        System.out.println(name);
        System.out.println(value);
    }
}
