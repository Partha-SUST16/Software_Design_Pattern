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
public class Main {
    public static void main(String[] args) {
        Machine m = new Machine();
        for(int i=0;i<4;i++)
            m.nextStep();
    }
}
