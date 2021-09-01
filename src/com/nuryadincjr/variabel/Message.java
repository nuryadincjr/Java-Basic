package com.nuryadincjr.variabel;

public class Message {
    /*
    Intenceof: Keyword (instanceof) untuk membadingkan suatu objek, instansiasi dari suatu Class atau tidak dengan nilai result boolean. 
    Pendeklarasian:  <namaObject> instanceof <NamaClass>;
    */

    String pesan = "Helo STTBandung";

    public static void main(String[] args) {
        Message message = new Message();

        System.out.println(message instanceof Message); // Result: true
        System.out.println(message.pesan instanceof String); //Result: true
    }
}
