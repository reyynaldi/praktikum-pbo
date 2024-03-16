package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int JumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.JumlahSisi = JumlahSisi;
    }

    public double hitungLuas(){
        return (this.alas*this.tinggi)/2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga Bersisi: " + this.getJumlahSisi());
    }
}
