public class NestedFor {
    /*
    Statemen For Bersarang: Perulangan bertingkat For dalam For, 
    looping didalamnya akan dieksekusi dalam satu kali looping diluarnya.
    for (initialization1; condition1; step_value1) {
        for (initialization2; condition2; step_value2) {
            // statement aksi 
        }   
    }
    */

    public static void main(String[] args) {

        // first for
        for(int i = 0; i < 10; i++) {
            System.out.print(i + "=>");
            
            // second for
            for(int j = 0; j < 10; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
