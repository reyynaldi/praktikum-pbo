/***********************************/
/* Program   : Lingkaran.java */
/* Deskripsi : Class Lingkaran */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 23 Maret 2024*/
/***********************************/

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    public double hitungLuas(){
        return (PI * jejari*jejari);
    }

}

