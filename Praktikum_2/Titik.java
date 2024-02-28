/***********************************/
/* Program   : Titik.java */
/* Deskripsi : Class, objek, dan method untuk Titik */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 28 Februari 2024*/
/***********************************/

public class Titik {
    private float absis;
    private float ordinat;
    static float counterTitik;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(float absis, float ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    void setAbsis(float a){
        absis = a;
    }

    void setOrdinat(float a){
        ordinat = a;    
    }

    float getAbsis(){
        return absis;
    }

    float getOrdinat(){
        return ordinat;
    }

    static float getCounterTitik(){
        return counterTitik;
    }

    public void refleksiY(){
        this.ordinat = this.ordinat - (2*this.ordinat);
    }
    
    public void refleksiX(){
        this.absis = this.absis - (2*this.absis);
    }

    public Titik getRefleksiY(){
        return new Titik((this.absis), -(this.ordinat));
    }

    public Titik getRefleksiX(){
        return new Titik(-(this.absis), (this.ordinat));
    }

    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis-0,2)+Math.pow(this.ordinat-0,2));
    }

}