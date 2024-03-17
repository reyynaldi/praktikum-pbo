/***********************************/
/* Program   : Mahasiswa.java */
/* Deskripsi : Class Mahasiswa */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 17 Maret 2024*/
/***********************************/

package org.mahasiswa;

import org.walimahasiswa.WaliMahasiswa;
import org.orang.Orang;

public class Mahasiswa extends Orang {
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;
    private int counterObj;
    
    public Mahasiswa(String nama, String nik, String jurusan, String nim, WaliMahasiswa wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
        counterObj++;
    }

    public Mahasiswa(){
        super();
        this.nim = "";
        this.jurusan = "";
        this.wali = new WaliMahasiswa();
        counterObj++;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }

    public int getCounterObjek(){
        return counterObj;
    }

    public WaliMahasiswa getWali(){
        return wali;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        super.cetak();
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Jurusan Mahasiswa: " + jurusan);
        wali.cetak();
    }

}
