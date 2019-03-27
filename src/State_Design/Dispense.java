/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State_Design;

/**
 *
 * @author USER
 */
public class Dispense implements State{

    @Override
    public void nextStep(Machine m) {
        m.set_state(new NoCoin());
        System.out.println("REceive your Cake :P");
    }
    @Override
    public void insert() {
        System.out.println("Coin Rejected");
    }
}
