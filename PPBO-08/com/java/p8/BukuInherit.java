// Nama : Helmi Hananto Desandra
// NIM  : M0521029

package com.java.p8;

public class BukuInherit extends Buku {
    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {
        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
}

/*
Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier? Jelaskan penyebab errornya!
Jawab:
Terdapat error pada super.penulis. Hal ini disebabkan karena 
attribute penulis pada file Buku.java dalam pakage com.java.p8 memiliki acces modofier private.
Sehingga, hanya diakses dalam class Buku tersebut.
*/