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
