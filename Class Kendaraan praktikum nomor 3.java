/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Kendaraan {
    
    static void hi(){
    String Jenis, merk, brand, warna;
    int cc, tahunproduksi;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("---KENDARAAN---");
    System.out.print("Jenis Kendaraan = ");
    Jenis = sc.nextLine();
    System.out.print("Merk Kendaraan = ");
    merk = sc.nextLine();
    System.out.print("Brand Kendaraan = ");
    brand = sc.nextLine();
    System.out.print("Warna Kendaraan = ");
    warna = sc.nextLine();
    System.out.print("CC kendaraan = ");
    cc = sc.nextInt();
    System.out.print("Tahun Produksi = ");
    tahunproduksi = sc.nextInt();
    
    //output
    System.out.println("--------------------------");
    System.out.println("Jenis = "+Jenis);
    System.out.println("Merk = "+merk);
    System.out.println("Brand = "+brand);
    System.out.println("Warna = "+warna);
    System.out.println("CC = "+cc);
    System.out.println("Tahun Produksi = "+tahunproduksi);
}
}
