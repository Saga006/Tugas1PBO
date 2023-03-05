/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Galang
 */
public class Lingkaran implements MenghitungBidang{
    double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double luas() {
        return Math.PI*jari*jari;
        
    }
    
    @Override
    public double keliling() {
        return 2*Math.PI*jari;
    }

}
