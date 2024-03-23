/***********************************/
/* Program   : BangunDatar.java */
/* Deskripsi : Class Abstract Bangun Datar */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 23 Maret 2024*/
/***********************************/

package standar.abstrak;

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double luas){
        this.luas = luas;
    }

    public double getLuas(){
        return luas;
    }
}
