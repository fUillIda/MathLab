/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.w3schools.javatutorial.methods;

/**
 *
 * @author Azmi Saiful
 */
public class Exercise5 {
    static void checkAge(int age) {
        //if age is less than 18, print "Access Denied"
        if (age < 18){
            System.out.println("Access Denied");
        }
        //if age is greater than 18, print "Access granted"
        else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        //Insert code here
        checkAge(20);
    }
}
