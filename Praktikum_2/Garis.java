/***********************************/
/* Program   : Garis.java */
/* Deskripsi : Class, objek, dan method untuk Garis */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 28 Februari 2024*/
/***********************************/

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    static float counterObj;

    Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
        counterObj++;
    }

    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterObj++;
    }

    public void setTitikAwal(Titik T){
        titikAwal = T;
    }

    public void setTitikAkhir(Titik T){
        titikAkhir = T;
    }

    public Titik getTitikAwal(){
       return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public Float getCounterObjek(){
        return counterObj;
    }

    public double getPanjang(){
        Titik tAwal = this.getTitikAwal();
        Titik tAkhir = this.getTitikAkhir();

        return Math.sqrt((Math.pow(tAkhir.getAbsis() - tAwal.getAbsis(), 2)) + Math.pow(tAkhir.getOrdinat() - tAwal.getOrdinat(), 2));
    }

    public double getGradien(){
        Titik tAwal = this.getTitikAwal();
        Titik tAkhir = this.getTitikAkhir();
        return (tAkhir.getOrdinat() - tAwal.getOrdinat())/(tAkhir.getAbsis() - tAwal.getAbsis());
    }

    public Garis getRefleksiY(){
        Titik tAwal = this.getTitikAwal();
        Titik tAkhir = this.getTitikAkhir();
        return new Garis(new Titik(-(tAwal.getAbsis()), tAwal.getOrdinat()), new Titik(-(tAkhir.getAbsis()), tAkhir.getOrdinat()));
    }

    public boolean isTegakLurus(Garis G){
        if (this.getGradien() * G.getGradien() == -1){
            return true;
        }
        else{
            return false;
        }
    }

}

