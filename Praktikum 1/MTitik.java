public class MTitik {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;

        t1 = new Titik();
        t2 = new Titik();

        t1.setAbsis(5);
        t1.setOrdinat(6);
        t2.setAbsis(11);
        t2.setOrdinat(10);

        float counterTitik;
        float absist1;
        float ordinatt1;
        float absist2;
        float ordinatt2;

        absist1 = t1.getAbsis();
        ordinatt1 = t1.getOrdinat();
        
        absist2 = t2.getAbsis();
        ordinatt2 = t2.getOrdinat();

        counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah objek titik: " + counterTitik);
        System.out.println("absisT1: " + t1.getAbsis());
        System.out.println("ordinatT1: " + t1.getOrdinat());
        System.out.println("absisT2: " + t2.getAbsis());
        System.out.println("ordinatT2: " + t2.getOrdinat());

        System.out.println("t1: (" + absist1 + ", " + ordinatt1 + ")");
        System.out.println("t2: (" + absist2 + ", " + ordinatt2 + ")");
    }
}
