/***********************************/
/* Program   : Orang.java */
/* Deskripsi : Class Orang */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 17 Maret 2024*/
/***********************************/

package org.orang;

public class Orang {
    protected String nama;
    protected String nik;

    public Orang(){
        this.nama = "";
        this.nik = "";
    }

    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama(){
        return this.nama;
    }
    public String getNik(){
        return this.nik;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }

    public void cetak(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
    }
}
