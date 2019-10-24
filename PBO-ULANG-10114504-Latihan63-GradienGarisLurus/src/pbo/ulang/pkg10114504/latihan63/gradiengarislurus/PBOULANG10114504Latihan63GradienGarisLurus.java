/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan63.gradiengarislurus;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi konsep pendekatan Isi nilai koordinat titik langsung diketikkan hardcode di coding

 */
public class PBOULANG10114504Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat xy = new Koordinat(0,0,0,0);
        xy.setX1(2);
        xy.setY1(10);
        xy.setX2(5);
        xy.setY2(7);
        System.out.println("Garis yang melalui titik ("+xy.getX1()+","
                +xy.getY1()+") dan ("+xy.getX2()+","+xy.getY2()+")");
        System.out.println("Memiliki Gradien Sebesar "+xy.hitungGradien());
        
        System.out.println("");
        
        Koordinat obj2 = new Koordinat(0,0,0,0);
        obj2.setX1(5);
        obj2.setY1(1);
        obj2.setX2(3);
        obj2.setY2(12);
        System.out.println("Garis yang melalui titik ("+obj2.getX1()+","
                +obj2.getY1()+") dan ("+obj2.getX2()+","+obj2.getY2()+")");
        
        System.out.println("Memiliki Gradien Sebesar "+obj2.hitungGradien());
    }
    
}
