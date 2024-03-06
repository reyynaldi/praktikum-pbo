/*Nama: Muhammad Reynaldi Akbar */
/*NIM:  24060122130052 */
/*File: Asersi2.java */
/*Deskripsi: File Java Asersi2 */

class Lingkaran{
    private double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }

}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "Jari-jari tidak boleh dari 0";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}

//Jika jariJari < 0, assert tetap mengembalikan nilai false demikian sehingga pesan "... tidak boleh 0" diprint, terlepas jari-jari yang bernilai negative
//Sehingga secara konseptual, baris tersebut salah