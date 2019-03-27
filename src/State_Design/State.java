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
public interface State {
    void nextStep(Machine m);
    void insert();
}
