/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Pattern;

/**
 *
 * @author USER
 */
public class Originator {
    private String state;
    private CareTaker ct;
    public Originator()
    {
        ct = new CareTaker();
    }
    public void setState(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }
    public void save() {
        System.out.println("Originator: Saving to Memento.");
        ct.addMe(new Memento(state));
    }
    public void undo()
    {
        ct.undo();
    }
    public void redo()
    {
        ct.redo();
    }
}
