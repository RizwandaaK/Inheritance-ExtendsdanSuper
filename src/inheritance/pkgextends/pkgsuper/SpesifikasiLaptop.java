/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.pkgextends.pkgsuper;

/**
 *
 * @author rizwa
 */
public class SpesifikasiLaptop extends Main {
    //Deklarasi variabel instance.
    String merek;
    String nama;
    String tipe;
    
    //Membuat method Public dengan parameter.
    public void Merek(String m) {
        merek = m;
        System.out.println("Nama Merek                  : "+merek);
    }
    public void Nama(String n) {
        nama = n;
        System.out.println("Nama                        : "+nama);
    }
    public void Tipe(String t) {
        tipe = t;
        System.out.println("Tipe                        : "+tipe);
    }
    //
    protected void Judul() {
        System.out.println("=>=>=>=>=>=>=>>>>>>>>>> SPESIFIKASI LAPTOP <<<<<<<<<<=<=<=<=<=<=<=");
    }
}
