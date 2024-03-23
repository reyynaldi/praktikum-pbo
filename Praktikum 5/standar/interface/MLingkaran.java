/***********************************/
/* Program   : MLingkaran.java */
/* Deskripsi : Class MLingkaran */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 23 Maret 2024*/
/***********************************/

import java.util.Scanner;

public class MLingkaran{
    public static void main(String[] args){
            Scanner scan1;
            double jejari;
            Lingkaran luas;
            
            scan1 = new Scanner(System.in);
            System.out.print("Masukan jejari lingkaran 1: ");

            jejari = scan1.nextDouble();
            luas = new Lingkaran(jejari);
            
            System.out.println("Luas lingkaran 1 adalah " + luas.hitungLuas());
            

            scan1.close();
        }


}
