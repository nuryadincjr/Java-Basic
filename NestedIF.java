public class NestedIF {
    /*
    Statemen If Bersarang: Percabangan bertingkat If didalam If atau kondisi didalam kondisi.
    if (condition1) {
    if (condition2) {
    // statement aksi
    } else
        // statement default 2
    }
    } else
        // statement default  1
    }
    */

    public static void main(String[] args) {
        int nilai = 80, skbm = 75;

        if(nilai > skbm) {
            System.out.println("Nilai di atas rata-rata");

            if (nilai < 90) {
                System.out.println("Nilai yang didapat adalah B");
            } else {
                System.out.println("Nilai yang didapat adalah A");
            }
        } else {
            System.out.println("Nilai dibawah rata-rata");
        }
    }
}
