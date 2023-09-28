/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan24;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        try (Scanner input = new Scanner(System.in)) {
            String ulangi = "ya";
            
            System.out.println("=====Program Perbandingan Nilai=====");
            while (ulangi.equals("ya")) {
                System.out.print("Masukkan nilai pertama: ");
                int nilaiPertama = input.nextInt();
                
                System.out.print("Masukkan nilai kedua: ");
                int nilaiKedua = input.nextInt();
                
                if (nilaiPertama > nilaiKedua) {
                    System.out.println("Hasil = " + nilaiPertama + " lebih besar dari " + nilaiKedua);
                } 
                else if (nilaiPertama < nilaiKedua) {
                    System.out.println("Hasil = " + nilaiPertama + " lebih kecil dari " + nilaiKedua);
                } 
                else {
                    System.out.println("Hasil = " + nilaiPertama + " sama dengan " + nilaiKedua);
                }
                
                System.out.print("\nUlangi aktivitas? (ya/tidak): ");
                ulangi = input.next();
                
                System.out.println("\nDeveloped by: Salsa Nurul Laeli");
            }
    }}}

