
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nama : Firman Ardhiansyah 
 *         Kelas : IF-2 (PB02) 
 *         NIM : 10117056
 * Deskripsi : Program ini berisi Program untuk menampilkan Ejaan huruf kata yang diinputkan
 */
public class PB0210117056Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int panjang;
        char huruf;

        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan nama depan Anda untuk di eja : ");
        nama = scn.next();
        panjang = nama.length(); //jumlah huruf untuk looping

        System.out.println("\nEjaan untuk " + " \"" + nama + "\" adalah : ");

        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
}
