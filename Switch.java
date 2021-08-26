public class Switch {
    /*
    Statemen Swich: Memilih salah satu dari ekspresi berupa satuan, String atau enum.
    switch(variable) {
        case <value>:
            // statement aksi
                break;
        case ke-n...
        default:
            // statement default
    }
*/

    public static void main(String[] args) {
        int menu = 3;

        switch (menu) {
            case 1:
                System.out.println("Menu - 1 Ayam Penyet");
                break;
            case 2:
                System.out.println("Menu - 2 Pepes Kakap");
                break;
            case 3:
                System.out.println("Menu - 3 Rendang");
                break;
            case 4:
                System.out.println("Menu - 4 Telur Dadar");
                break;
            default:
                System.out.println("Menu - " + menu + " tidak tersedia");
                break;
        }
    }
}
