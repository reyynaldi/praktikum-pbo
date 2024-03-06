/***********************************/
/* Program   : Main.java */
/* Deskripsi : Main driver dari Buku dan Anggota serta exception terkait */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 6 Maret 2024*/
/***********************************/

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Cara Memasak Lebah");
        Buku buku2 = new Buku("Cara Membuat Kucing Kawin");
        Buku buku3 = new Buku("Kiat-Kiat Menjadi Barber Bulu Mata");
        Buku buku4 = new Buku("Langkah Menjadi Hebat Dalam Bermain Pingpong");

        Anggota Anggota1 = new Anggota("Iwan");
        Anggota Anggota2 = new Anggota("Acun");

        try{
            Anggota1.pinjamBuku(buku1);
            Anggota1.pinjamBuku(buku2);
            Anggota1.pinjamBuku(buku3);
            Anggota1.pinjamBuku(buku4);
        } catch (BukuTidakTersediaException bex){
            System.out.println(bex.getMessage());
        } catch (MaksimumBukuTerpinjamException mex){
            System.out.println(mex.getMessage());
        }
        
        System.out.println("Nama Anggota: " + Anggota1.getNama());
        System.out.println("Jumlah Pinjaman Anggota: " + Anggota1.getJumlahBukuPinjaman());
        System.out.println("Judul Buku Yang Dipinjam: ");
        Anggota1.CetakListBuku();

        try{
            Anggota2.pinjamBuku(buku3);
        } catch (BukuTidakTersediaException bex){
            System.out.println(bex.getMessage());
        } catch (MaksimumBukuTerpinjamException mex){
            System.out.println(mex.getMessage());
        }

        System.out.println("Nama Anggota: " + Anggota2.getNama());
        System.out.println("Jumlah Pinjaman Anggota: " + Anggota2.getJumlahBukuPinjaman());
        System.out.println("Judul Buku Yang Dipinjam: ");
        Anggota2.CetakListBuku();

        Anggota1.getJumlahBukuPinjaman();
        Anggota1.getBukuPinjaman();

    }
}
