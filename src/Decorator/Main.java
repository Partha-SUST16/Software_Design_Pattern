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
public class Main {
    public static void main(String[] args) {
        Widget widget = new AddCheeseBurger(new AddLetusBurger(new Burger()));
        widget.make();
    }
}
