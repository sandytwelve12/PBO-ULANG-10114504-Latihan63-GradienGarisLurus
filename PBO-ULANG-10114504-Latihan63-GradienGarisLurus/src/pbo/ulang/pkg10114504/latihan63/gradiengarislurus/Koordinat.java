/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan63.gradiengarislurus;

/**
 *
 * @author Sandy Akbar
 */
public class Koordinat implements GarisLurus{
  private int x1,x2,y1,y2;
 
    
    public Koordinat(int x1,int y1,int x2, int y2){
        
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    @Override
    public int hitungGradien(){
       return (y2-y1)/(x2-x1);
    
}
}