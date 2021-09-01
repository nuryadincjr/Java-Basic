package com.nuryadincjr.method;

public class Method {
    /*
    Method di Java: block kode yang di referensikan dengan sebuah nama yang dapat dipanggil untuk dijalankan. 
    Harus mendeklarasikan objek, dipanggil dengan namaMethod();
    <return_type> namaMethod() {
        return value;
    }
    */

    String getURL() {
        return "https://github.com/nuryadin.cjr";
    }

    public static void main(String[] args) {
        
        Method url = new Method();
        System.out.println(url.getURL());
    }
}