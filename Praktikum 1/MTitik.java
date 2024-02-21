public class MTitik {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;

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

    }
}
