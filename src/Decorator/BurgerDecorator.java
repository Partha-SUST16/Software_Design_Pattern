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
abstract public class BurgerDecorator implements Widget{
    Widget widget;
    public BurgerDecorator(Widget widget) {
        this.widget = widget;
    }
    public void makeBurger(){
        widget.make();
    }
    
    
}
