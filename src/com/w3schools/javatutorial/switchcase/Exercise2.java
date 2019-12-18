/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.w3schools.javatutorial.switchcase;

/**
 *
 * @author Azmi Saiful
 */
public class Exercise2 {
    public static void main(String[] args) {
        //Insert code here
        int day = 4;
        switch (day) {
          case 1:
            System.out.println("Saturday");
            break;
          case 2:
            System.out.println("Sunday");
            break;
          default:
            System.out.println("Weekend");
        }
    }
}
