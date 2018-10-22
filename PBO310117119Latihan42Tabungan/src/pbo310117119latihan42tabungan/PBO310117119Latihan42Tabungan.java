/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan42tabungan;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S
 * NIM : 10117119
 * Kelas : PBO 3
 * Deskripsi Program : Program ini dapat menampilkan saldo hasil penarikan
 */
public class PBO310117119Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);

        System.out.println("=======Program Penarikan Uang=======");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(sca.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.print("Saldo anda Sekarang : "
                + tabungan.ambilUang(sca.nextInt()) + "\n");

    }

}
