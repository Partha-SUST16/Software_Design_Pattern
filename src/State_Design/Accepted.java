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
public class Accepted implements State{

    @Override
    public void nextStep(Machine m) {
        m.set_state(new Dispense());
        System.out.println("Accepted Coin");
    }
    @Override
    public void insert() {
        System.out.println("Coin Rejected");
    }
}
