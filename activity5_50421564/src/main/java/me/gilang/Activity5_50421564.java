/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.gilang;

import me.gilang.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Gilang
 */
@SpringBootApplication
public class Activity5_50421564 implements CommandLineRunner {
    @Autowired
    private MahasiswaController mhsController;

    public static void main(String[] args) {
        SpringApplication.run(Activity5_50421564.class, args);
    }
    
    @Override
    public void run (String... args)throws Exception {
        mhsController.tampilkanMenu();
    }
}
