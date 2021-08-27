public class MethodParameter {
    /*
    Method Parameter: fungsi untuk menerima parameter dengan tipe data tertentu. 
    Dipanggil dengan namaMetod(<parameter_value>); 
    <return_type> namaMethod(<parameter>) {
        return value;
    }
    */

    static void printMessage(int num, String msg) {
        for(int i = 0; i < num; i++) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        printMessage(1, "Nuryadin Abutani");
        printMessage(5, "https://github.com/nuryadin.cjr");
    }
}
