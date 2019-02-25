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
public class AddLetusBurger extends BurgerDecorator{

    public AddLetusBurger(Widget widget) {
        super(widget);
    }

    @Override
    public void make() {
        widget.make();
        
        addLetus();
    }
    void addLetus(){
        
        System.out.println("Letus pata added :v ");
    }
    
}
