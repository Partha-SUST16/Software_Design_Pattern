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
public class AddCheeseBurger extends BurgerDecorator{

    public AddCheeseBurger(Widget widget) {
        super(widget);
    }

    @Override
    public void make() {
        widget.make();
        addCheese();
    }
    void addCheese(){
        System.out.println("Cheese Added to burger");
    }
    
    
}
