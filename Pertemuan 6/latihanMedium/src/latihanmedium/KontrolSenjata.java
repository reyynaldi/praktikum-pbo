/*Nama: Muhammad Reynaldi Akbar*/
/*NIM: 24060122130052*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author Rey
 */
public class KontrolSenjata {
    Senjata s;
    
    public KontrolSenjata(Senjata s){
        this.s = s;
    }
    
    public boolean isAdaPeluru(){
        return this.s.getPeluru()!=0;
    }
    
    public void isiPeluru(int jumPeluru){
        this.s.setPeluru(s.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!(isAdaPeluru())){
            System.out.println("Peluru Habis");
        } else{
            for (int i = 0; i < jumlah; i++){
                if (isAdaPeluru()){
                    this.s.menembak();
                } else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + s.getPeluru());
        }
        
    }
    
    public String menusuk(){
        if (this.s.isMenusuk() == true){
            return "Jleb!";
        } else {
            return "No Bayonet la";
        }
    }
    
    public void pasangBayonet(){
        s.setMenusuk(true);
        System.out.println("Bayonet sudah terpasang!");
    }
            
         
}
