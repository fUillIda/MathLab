/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.w3schools.javatutorial.loops;

/**
 *
 * @author Azmi Saiful
 */
public class Exercise6 {
    public static void main(String[] args) {
        //Insert code here
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
        }
    }
}
