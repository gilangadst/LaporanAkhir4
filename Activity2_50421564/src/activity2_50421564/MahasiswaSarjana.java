/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2_50421564;

/**
 *
 * @author Gilang
 */
public class MahasiswaSarjana extends Mahasiswa{
    private String jurusan;
    
    //Membuat super class menggunakan variabel dari class Mahasiswa
    public MahasiswaSarjana(String nama, String npm, int umur, String jurusan) {
        super(nama, npm, umur); 
        this.jurusan = jurusan;
    }
    
    @Override
    //Membuat super class menggunakan variabel dari class MahasiswaSarjana
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("jurusan: " + jurusan);
    }
}
