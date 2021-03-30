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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KartuGrafis gpu1 = new KartuGrafis();
        gpu1.Judul();
        
        SpesifikasiLaptop spek = new SpesifikasiLaptop();
        System.out.println("");
        spek.Merek("Asus");
        spek.Nama("Zephyrus");
        spek.Tipe("G14");
        
        Layar display = new Layar();
        System.out.println("");
        display.Layar("IPS-LCD");
        display.Resolusi("16:9 1920x1080 pixel");
        
        Prosesor cpu = new Prosesor();
        System.out.println("");
        cpu.Pabrikan("Intel");
        cpu.KartuProsesor("i7-9750");
        cpu.ClockSpeed("2,8 GHz");
        
        KartuGrafis gpu = new KartuGrafis();
        gpu.Pabrikan("NVIDIA");
        gpu.JenisKartu("GeForce RTX 2080");
        
    }
}
