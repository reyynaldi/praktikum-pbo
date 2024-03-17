/***********************************/
/* Program   : Main.java */
/* Deskripsi : Class Main */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 17 Maret 2024*/
/***********************************/

package org.main;

import org.mahasiswa.Mahasiswa;
import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1; Mahasiswa m2;
        WaliMahasiswa w1, w2;
        Orang o1;

        o1 = new Orang("Rani", "125");
        w2 = new WaliMahasiswa(o1.getNama(), o1.getNik(), "0882", "Jl. Kaki");
        w1 = new WaliMahasiswa("Reno", "234", "0881", "Jl. Jalan");
        m1 = new Mahasiswa("Yogi", "123", "Biologi", "567", w1);
        m2 = new Mahasiswa("Yoga", "124", "Statistika", "568", w1);

        m1.cetak();
        m2.cetak();
        w1.cetak();
        w2.cetak();

    }
}
