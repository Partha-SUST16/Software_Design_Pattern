/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author USER
 * 
 */
public class Main {
    public static void main(String[] args) {
        Factory fact  =new Factory();
        
        iButton ib = fact.getDevice("IOS");
        ib.createButton();
        ib =  fact.getDevice("Android");
        ib.createButton();
    }
    
}
