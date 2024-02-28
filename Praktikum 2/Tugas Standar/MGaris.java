public class MGaris {
    public static void main(String[] args){
        Garis g1;
        Garis g2;
        Garis g3;
        Garis g4;
    
        g1 = new Garis(new Titik(2, 3), new Titik(6, 9));
        g3 = new Garis(new Titik(1, 2), new Titik(3, 4));
        g4 = new Garis(new Titik(1, 4), new Titik(3, 2));

        System.out.println(("Panjang: " + g1.getPanjang()));
        System.out.println(("Gradien: " + g1.getGradien()));
        g2 = g1.getRefleksiY();
        
        System.out.println("G1 Titik Awal: (" + g1.getTitikAwal().getAbsis() + ", " + g1.getTitikAwal().getOrdinat() + ")");
        System.out.println("G1 Titik Akhir: (" + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat() + ")");
        System.out.println("G2 Titik Awal: (" + g2.getTitikAwal().getAbsis() + ", " + g2.getTitikAwal().getOrdinat() + ")");
        System.out.println("G2 Titik Akhir: (" + g2.getTitikAkhir().getAbsis() + ", " + g2.getTitikAkhir().getOrdinat() + ")");
        System.out.println("G3 Titik Awal: (" + g3.getTitikAwal().getAbsis() + ", " + g3.getTitikAwal().getOrdinat() + ")");
        System.out.println("G3 Titik Akhir: (" + g3.getTitikAkhir().getAbsis() + ", " + g3.getTitikAkhir().getOrdinat() + ")");
        System.out.println("G4 Titik Awal: (" + g4.getTitikAwal().getAbsis() + ", " + g4.getTitikAwal().getOrdinat() + ")");
        System.out.println("G4 Titik Akhir: (" + g4.getTitikAkhir().getAbsis() + ", " + g4.getTitikAkhir().getOrdinat() + ")");
        System.out.println(("Gradien: " + g3.getGradien()));
        System.out.println(("Gradien: " + g4.getGradien()));
        System.out.println("isTegak Lurus: " + g3.isTegakLurus(g4));
    }
}
