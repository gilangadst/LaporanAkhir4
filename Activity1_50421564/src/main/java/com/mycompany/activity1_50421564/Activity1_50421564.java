/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity1_50421564;
import  java.util.Scanner; // Import untuk Scanner

/**
 *
 * @author Gilang
 */
public class Activity1_50421564 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama anda: "); //Membuat fungsi input untuk variabel nama
        String nama = input.nextLine();
        
        System.out.println("Masukkan npm anda: "); //Membuat fungsi input untuk variabel npm
        String npm = input.nextLine();
        
        System.out.println("Masukkan umur anda: "); //Membuat fungsi input untuk variabel umur
        int umur = input.nextInt();
        
        System.out.println("Nama Anda adalah " + nama); //Menampilkan output nama dari variabel nama
        System.out.println("Npm Anda adalah " + npm); //Menampilkan output npm dari variabel npm
        System.out.println("Umur Anda adalah " + umur + " tahun"); //Menampilkan output umur dari variabel umur
    }
}
