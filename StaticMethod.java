public class StaticMethod {
    /*
    Static Method: keyword static, bisa memanggilnya dimanapun 
    didalam Class tersebut tanpa mendeklarasikan objek.
    */

    static String getURL() {
        return "https://github.com/nuryadin.cjr";
    }

    public static void main(String[] args) {
        
        System.out.println(getURL());
    }
}
