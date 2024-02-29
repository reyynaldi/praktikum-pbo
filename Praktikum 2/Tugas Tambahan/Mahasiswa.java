public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;
    private int counterObj;
    
    Mahasiswa(String nama, String jurusan, String nim, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
        counterObj++;
    }

    Mahasiswa(){
        this.nama = "";
        this.nim = "";
        this.jurusan = "";
        this.wali = new WaliMahasiswa();
        counterObj++;
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }

    public int getCounterObjek(){
        return counterObj;
    }

    public WaliMahasiswa getWali(){
        return wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Jurusan Mahasiswa: " + jurusan);
        wali.cetak();
    }

}
