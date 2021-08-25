class Main {
    // Intance Variable
    /*
    Variabel yang dideklarasikan diluar Method atau Konstruktor, didalam sebuah Class.
    •	Dibuat unuk penggunaan variabel untuk banytak Method.
    •	Tidak harus dideklarasikan nilai awl, dan akan bernilai default dan mengembalikan nilai untuk Int = 0, boolean = false, dan Referensi Object = null.
    class Main{
        <type_data> nameVariable;
        Public static void main(string[] args) {
            Main intanceVariable = new Main();
            System.out.println(intanceVariable.<type_data>); 
        }	
    }

    */
    
    String name;
    public static void main(String[] args) {
        // Object
        Main main = new Main();
        System.out.println(main.name);
    }
}