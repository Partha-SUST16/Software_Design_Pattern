/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite_Pattern;

/**
 *
 * @author USER
 */
public class Item implements AbstractMenu{
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public void trav() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }
}
