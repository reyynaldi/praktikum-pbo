public class Main {
    public static void main(String[] args){
        Mahasiswa m1;
        WaliMahasiswa w1;

        w1 = new WaliMahasiswa("Yudi", "087746728", "Jl. BB");
        m1 = new Mahasiswa("Yadi", "Biologi", "1234", w1);

        m1.cetak();

    }
}
