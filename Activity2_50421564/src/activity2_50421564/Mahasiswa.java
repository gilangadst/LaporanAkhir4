/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2_50421564;

/**
 *
 * @author Gilang
 */
public class Mahasiswa {
    private String nama;
    private String npm;
    private int umur;
    
    //Deklarasi variabel dari class mahasiswa
    public Mahasiswa(String nama, String npm, int umur) {
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }
    
    //Menampilkan output menggunakan variabel dari class mahasiswa
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Npm: " + npm);
        System.out.println("Umur: " + umur);
    }
}
