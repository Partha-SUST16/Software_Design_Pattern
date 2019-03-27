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
public class Machine {
    private State currentState;
    
    public Machine()
    {
        currentState = new NoCoin();
    }
    
    public void set_state(State s)
    {
        currentState = s;
    }
    public void nextStep(){
        currentState.nextStep(this);
    }
}
