package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga(10, 10, 3);

        persegiPanjang.printInfo();
        segitiga.printInfo();

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}
