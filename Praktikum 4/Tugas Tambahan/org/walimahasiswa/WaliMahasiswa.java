/***********************************/
/* Program   : WaliMahasiswa.java */
/* Deskripsi : Class WaliMahasiswa */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 17 Maret 2024*/
/***********************************/

package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang {
    private String nomorHp;
    private String alamat;
    private int counterObj;

    public WaliMahasiswa(){
        super();
        nomorHp = "";
        alamat = "";
        counterObj++;
    }

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat){
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
        counterObj++;
    }

    public String getNomorHp(){
        return nomorHp;
    }

    public String getAlamat(){
        return alamat;
    }

    public int getCounterObjek(){
        return counterObj;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Nomor HP Wali Mahasiswa: " + nomorHp);
        System.out.println("Alamat Wali Mahasiswa: " + alamat + "\n");
    }

}

