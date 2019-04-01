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
public class Main {
    public static void main(String[] args) {
        Originator orin = new Originator();
        orin.setState("Hi");
        orin.save();
        orin.setState("There");
        orin.save();
        orin.undo();
        orin.setState("Whats");
        orin.save();
        orin.undo();
       
        orin.redo();
    }
}
