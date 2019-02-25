/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author USER
 */
public class Burger implements Widget{

    @Override
    public void make() {
        System.out.println("Burger made :P ");
    }
    
}
