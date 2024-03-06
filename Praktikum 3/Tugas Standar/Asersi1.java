/*Nama: Muhammad Reynaldi Akbar */
/*NIM:  24060122130052 */
/*File: Asersi1.java */
/*Deskripsi: File Java Asersi1 */

public class Asersi1 {
    public static void main(String[] args){
        int x=-10;
        if (x>0) {
            System.out.println("x bilangan positif");
        } else{
            assert (x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
