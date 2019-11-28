/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car benz=CarFactory.getCar("Benz","240","20","Black");
        Car bmw =CarFactory.getCar("Bmw","270","30","White");
        
        System.out.println("Benz Specifications --> "+benz);
        System.out.println("Bmw  Specifications --> "+bmw);
    }
    
}
