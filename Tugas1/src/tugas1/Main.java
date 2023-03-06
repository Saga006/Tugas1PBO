/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Galang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ulang = false;
        int pil;
        int ulng;
        double panjang;
        double lebar;
        double tinggi;
        double jari;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========");
        System.out.println("MENU UTAMA");
        System.out.println("==========");
        
        while(!ulang)
        {
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit"); 
            System.out.print("Pilih : ");
            pil = input.nextInt();
            
            switch (pil)
            {
                case 0 :
                    ulang = true;
                    break;
                case 1 :
                    System.out.print("Input Panjang : ");
                    panjang = input.nextDouble();
                    System.out.print("Input Lebar : ");
                    lebar = input.nextDouble();
                    System.out.print("Input Tinggi : ");
                    tinggi = input.nextDouble();
                    
                    Balok balok = new Balok(panjang,lebar,tinggi);
                    
                    System.out.println("Luas Persegi Panjang : " + balok.luas());
                    System.out.println("Keliling Persegi Panjang : " + balok.keliling()); 
                    System.out.println("Volume Balok : " + balok.volume());
                    System.out.println("Luas Permukaan Balok : " + balok.luas(tinggi)); 
                
                    break;
                case 2 :
                    System.out.print("Input Tinggi : ");
                    tinggi = input.nextDouble();
                    System.out.print("Input Jari-Jari : ");
                    jari = input.nextDouble();
                    
                    Tabung tabung = new Tabung(jari,tinggi);
                   
                    System.out.println("Luas Lingkaran : " + tabung.luas());
                    System.out.println("Keliling Lingkaran : " + tabung.keliling());
                    System.out.println("Volume Tabung : " + tabung.volume());
                    System.out.println("Luas Permukaan Tabung : " + tabung.luas(tinggi)); 
                    break;
            }  
            if(pil == 0)
            {
                break;
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 2) ");
            ulng = input.nextInt();
            if(ulng == 2)
            {
                ulang = true;
            }  
        }                    
    }
}
