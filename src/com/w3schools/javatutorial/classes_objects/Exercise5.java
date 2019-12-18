/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.w3schools.javatutorial.classes_objects;

/**
 *
 * @author Azmi Saiful
 */
public class Exercise5 {
    int x;

    public Exercise5() {
        x = 5;
    }

    public static void main(String[] args) {

        //Create an myObj object of clas MyClass (this will call the object)
        Exercise5 myObj = new Exercise5();
        //Print the value of x
        System.out.println(myObj.x);
    }
}
