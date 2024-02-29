public class WaliMahasiswa {
    private String nama;
    private String nomorHp;
    private String alamat;
    private int counterObj;

    WaliMahasiswa(){
        nama = "";
        nomorHp = "";
        alamat = "";
        counterObj++;
    }

    WaliMahasiswa(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
        counterObj++;
    }

    public String getNama(){
        return nama;
    }

    public String getNomorHp(){
        return nomorHp;
    }

    public String getAlamat(){
        return alamat;
    }

    public int getCounterObjek(){
        return counterObj;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setJurusan(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        System.out.println("Nama Wali Mahasiswa: " + nama);
        System.out.println("Nomor HP Wali Mahasiswa: " + nomorHp);
        System.out.println("Alamat Wali Mahasiswa: " + alamat);
    }

}
