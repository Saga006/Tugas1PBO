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
//        double nama;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan Nama : ");
//        nama = input.nextDouble();
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
                    
                    PersegiPanjang persegipanjang = new PersegiPanjang(panjang,lebar);
                    Balok balok = new Balok(panjang,lebar,tinggi);
                    
                    System.out.println("Luas Persegi Panjang : " + persegipanjang.luas());
                    System.out.println("Keliling Persegi Panjang : " + persegipanjang.keliling());  

                    System.out.println("Volume Balok : " + balok.volume());
                    System.out.println("Luas Permukaan Balok : " + balok.luas()); 
                
                    break;
                case 2 :
                    System.out.print("Input Tinggi : ");
                    tinggi = input.nextDouble();
                    System.out.print("Input Jari-Jari : ");
                    jari = input.nextDouble();
                    
                    Lingkaran lingkaran = new Lingkaran(jari);
                    Tabung tabung = new Tabung(jari,tinggi);
                    
                    System.out.println("Luas Lingkaran : " + lingkaran.luas());
                    System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
                    System.out.println("Volume Tabung : " + tabung.volume());
                    System.out.println("Luas Permukaan Tabung : " + tabung.luas()); 
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
