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
public class Prosesor extends SpesifikasiLaptop {
    String pabrikan;
    String jeniskartu;
    String clockspeed;
    
    public void Pabrikan(String b) {
        pabrikan = b;
        System.out.println("Pabrikan                    : "+pabrikan);
    }
    public void KartuProsesor(String cpu) {
        jeniskartu = cpu;
        System.out.println("Jenis Kartu                 : "+jeniskartu);
    }
    public void ClockSpeed(String cl) {
        clockspeed = cl;
        System.out.println("Clockspeed                  : "+clockspeed);
    }
}
