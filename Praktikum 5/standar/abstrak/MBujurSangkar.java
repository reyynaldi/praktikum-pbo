/***********************************/
/* Program   : MBujurSangkar.java */
/* Deskripsi : Class MBujurSangkar */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 23 Maret 2024*/
/***********************************/

package standar.abstrak;

import java.util.Scanner;
public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi Bujur Sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas Bujur Sangkar dengan sisi: " + sisi + " Adalah: " + bs.hitungLuas(sisi));
        scan.close();
    }
}
