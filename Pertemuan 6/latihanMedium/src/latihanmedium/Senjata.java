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
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata (String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    
    public String getBunyi (){
        return bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public void setBunyi (String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru (int peluru){
        this.peluru = peluru;
    }
    
    public void setMenusuk (boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public void menembak(){
        System.out.println(this.bunyi);
        this.peluru--;
    }

    public boolean isMenusuk (){
        return menusuk;
    }
}