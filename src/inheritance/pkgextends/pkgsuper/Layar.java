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
public class Layar extends SpesifikasiLaptop {
    String jenislayar;
    String resolusi;
    
    public void Layar(String L) {
        jenislayar = L;
        System.out.println("Jenis layar yang digunakan  : "+jenislayar);
    }
    public void Resolusi(String px) {
        resolusi = px;
        System.out.println("Resolusi                    : "+resolusi);
    }
    
}
