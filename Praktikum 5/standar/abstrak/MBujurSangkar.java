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
