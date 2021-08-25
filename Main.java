class Main {
    // Variable lokal
    /*
    Variabel lokal dideklarasikan didalam metod atau block, dan hanya dapat digunakan didalam method tersebut. Dibuat ketika method dipanggil dan dihapus setelah pemanggilannya.
    •	Pendeklarasiannya harus lengkap:  <type_data> namaVarabel = <value>;
    •	Variabel tidak bisa dipanggil langsung dari method.
    •	Pemanggilan variabel dari dalam method harus dibuat objek baru berdar Class-nya.
    */
    
    String name = "Nuryadin Abutani";
    public static void main(String[] args) {
        // Object
        Main main = new Main();
        System.out.println(main.name);
    }
}