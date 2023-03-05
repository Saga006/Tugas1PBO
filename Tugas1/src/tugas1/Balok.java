/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Galang
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return super.luas()*tinggi;
    }

    @Override
    public double luas() {
        return 2*((super.luas()) + (panjang*tinggi)+(lebar*tinggi));
    }
}
