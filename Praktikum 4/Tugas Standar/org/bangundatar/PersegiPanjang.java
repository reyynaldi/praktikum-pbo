package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double Panjang, double lebar, int JumlahSisi){
        this.panjang = Panjang;
        this.lebar = lebar;
        this.JumlahSisi = JumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang Bersisi: " + this.getJumlahSisi());
    }

}
