/***********************************/
/* Program   : Anggota.java */
/* Deskripsi : Class Anggota */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 6 Maret 2024*/
/***********************************/

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }
    public String getNama() {
        return nama;
    }
    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }
    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }
    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if (this.jumlahBukuPinjaman >= 3){
            throw new MaksimumBukuTerpinjamException("Tidak Boleh Melebihi 3!");
        }
        else if (buku.isTersedia() != true){
            throw new BukuTidakTersediaException("Buku Tidak Tersedia!");
        }
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }

    public void CetakListBuku(){
        for (int i = 0; i < jumlahBukuPinjaman; i++){
            System.out.print(bukuPinjaman[i].getJudul());
            if (i+1 < jumlahBukuPinjaman){
                System.out.print(", ");
            }
            else{
                System.out.println("\n");
            }
        }
    }

}