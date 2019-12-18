/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.inputstream;

import com.dicoding.javafundamental.mathlab.Calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Rbuffer {
   private int bil1,  bil2, chc;

   private char kode;
   private String kodeS;

   public char getKode() {
      return kode;
   }

   public void setKode(char kode) {
      this.kode = kode;
   }

   public String getKodeS() {
      return kodeS;
   }

   public void setKodeS(String kodeS) {
      this.kodeS = kodeS;
   }

   private void Rbuffer (int bil1, int bil2){
      this.bil1 = bil1;
      this.bil2 = bil2;
   }

   public int getBil1() {
      return bil1;
   }

   public void setBil1(int bil1) {
      this.bil1 = bil1;
   }

   public int getBil2() {
      return bil2;
   }

   public void setBil2(int bil1) {
      this.bil2 = bil1;
   }

   public static void input(){
      Scanner input = new Scanner(System.in);
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader buff = new BufferedReader(isr);
      Rbuffer rb = new Rbuffer();
      try {
         System.out.println("Program kalkulator sederhana");
         System.out.print("Masukkan Angka pertama : ");
         rb.setBil1(((rb.getChc() == 2) ? buff.read() : input.nextInt() ));
         System.out.print("Masukkan Angka kedua : ");
         rb.setBil2(((rb.getChc() == 2) ? buff.read() : (input.nextInt()) ));
         System.out.println("Operasi (+/-/x/:) ?");
         String kode = ( (rb.getChc() == 1) ? input.next() : buff.readLine());
         System.out.println(Calculate.Calculate(rb.getBil1(), rb.getBil2(), kode.substring(0, 1)) + " " + kode.substring(0, 1));
         System.out.println(rb.getBil2());
         System.out.println(kode.substring(0, 1) + " " + kode.substring(0, 1));
      } catch (IOException e){
         e.printStackTrace();
      }
   }

   public int getChc() {
      return chc;
   }

   public void setChc(int chc) {
      this.chc = chc;
   }
}
