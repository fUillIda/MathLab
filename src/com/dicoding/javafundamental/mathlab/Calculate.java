/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.mathlab;

/**
 *
 * @author lenovo
 */
public class Calculate {
    public static int Calculate(){
        return 0;
    }
    public static int Calculate(int x,int y,String p){
        switch (p) {
            case "+" :
                return x + y;
            case "-" :
                return x - y;
            case "x" :
                return x * y;
            case ":" :
                return x / y;
            default:
                return 0;
        }
    }
    
}
