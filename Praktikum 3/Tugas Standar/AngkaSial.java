/*Nama: Muhammad Reynaldi Akbar */
/*NIM:  24060122130052 */
/*File: AngkaSial.java */
/*Deskripsi: File Java AngkaSial */

public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("Hati Hati memasukan angka");
        }
    }
}

//Angka 12 tidak akan tereksekusi karena kode dalam try berhenti di angka 13
//Baris 21 akan Dieksekusi jika dan hanya jika angka == 13