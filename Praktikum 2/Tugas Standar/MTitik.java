/***********************************/
/* Program   : Main.java */
/* Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan kelas Titik */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 28 Februari 2024*/
/***********************************/

public class MTitik {
    public static void main(String[] args) {
        //Kamus
        Titik t1;
        Titik t2;
        Titik t3;
        Titik t4;
        Titik t5;


        //Algoritma
        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5, 8);

        t1.setAbsis(5);
        t1.setOrdinat(6);
        t2.setAbsis(11);
        t2.setOrdinat(10);

        float counterTitik;
        float absist1;
        float ordinatt1;
        float absist2;
        float ordinatt2;
        float absist3;
        float ordinatt3;

        absist1 = t1.getAbsis();
        ordinatt1 = t1.getOrdinat();
        
        absist2 = t2.getAbsis();
        ordinatt2 = t2.getOrdinat();

        absist3 = t3.getAbsis();
        ordinatt3 = t3.getOrdinat();

        counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah objek titik: " + counterTitik);


        System.out.println("t1: (" + absist1 + ", " + ordinatt1 + ")");
        System.out.println("t2: (" + absist2 + ", " + ordinatt2 + ")");
        System.out.println("t3: (" + absist3 + ", " + ordinatt3 + ")");
        

        t1.refleksiX();
        t1.refleksiY();
        System.out.println("Refleksi Y: " + t1.getOrdinat());
        System.out.println("Refleksi X: "+ t1.getAbsis());


        t4 = t2.getRefleksiX();
        t5 = t2.getRefleksiY();

        System.out.println(("Panjang: " + t1.getJarakPusat()));
        System.out.println("t4: (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
        System.out.println("t5: (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");


    }
}

/*Kesimpulan: Menggunakan enkapsulasi dan relasi dalam oop sangat berguna dan amat membantu dalam banyak hal.*/