/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2_50421564;

/**
 *
 * @author Gilang
 */
public class Activity2_50421564 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Gilang Adi Sutanto", "50421564", 21); //Membuat objek mahasiswa
        mahasiswa.tampilkanData();
        
        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana("Ucok", "56256564", 22, "Teknik Sipil"); //Membuat objek mahasiswa sarjana
        mahasiswaSarjana.tampilkanData();
    }
    
}