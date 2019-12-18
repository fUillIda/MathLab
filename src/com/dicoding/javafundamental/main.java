/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental;

import com.dicoding.javafundamental.inputstream.Rbuffer;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Rbuffer rb = new Rbuffer();
        
        do{
            System.out.println("Program kalkulator menggunakan class Scanner atau BufferedReader (1/2) 0 untuk menghentikan");
            rb.setChc(input.nextInt());

//            if (rb.getChc() == 1){
//                System.out.println("Program kalkulator sederhana");
//                System.out.print("Masukkan Angka pertama : ");
//                bil1 = input.nextInt();
//                System.out.print("Masukkan Angka kedua : ");
//                bil2 = input.nextInt();
//                System.out.println("Operasi (+/-/x/:) ?");
//                kode = input.next();
//                System.out.println(Calculate.Calculate(bil1, bil2, kode.substring(0, 1)) + " " + kode.substring(0, 1));
//            } else if (rb.getChc() == 2) {
//                System.out.println("Program kalkulator sederhana");
//                try {
//                    bil1 = 0; bil2 = 0;kode = null;
//                    System.out.print("Masukkan Angka pertama : ");
//                    bil1 = Integer.parseInt(buff.readLine());
//                    System.out.print("Masukkan Angka kedua : ");
//                    bil2 = Integer.parseInt(buff.readLine());
//                    System.out.println("Operasi (+/-/x/:) ?");
//                    kode = buff.readLine();
//
//                    System.out.println(Calculate.Calculate(bil1, bil2, kode.substring(0, 1)) + " " + kode.substring(0, 1));
//                } catch (IOException e){
//                    e.printStackTrace();
//                }
//                try {
//                    rb.input();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            } else {
//
//            }

            /** 12/16/2019 Commits :
             *  Perubahan proses input data yang tersaring dan terenkapsulasi*/
            if(rb.getChc() == 0)
                break;
            rb.input();
        }while(rb.getChc() != 0);
        about.about();
    }
    
}
