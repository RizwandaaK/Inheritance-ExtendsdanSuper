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
public class KartuGrafis extends SpesifikasiLaptop {
    String pabrikan;
    String jeniskartu;
    
    public void Pabrikan(String pab) {
        pabrikan = pab;
        System.out.println("Pabrikan                    : "+pabrikan);
    }
    public void JenisKartu(String gpu) {
        jeniskartu = gpu;
        System.out.println("Jenis Kartu                 : "+jeniskartu);
    }
    public KartuGrafis() {
    super();
    }
}
