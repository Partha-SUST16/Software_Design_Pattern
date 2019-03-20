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
public class CompositeDemo {
    public static StringBuffer compositeBuilder = new StringBuffer();
    public static void main(String[] args) {
       Menu breakfast = new Menu("Breakfast");
       Menu lunch = new Menu("Lunch");
       Menu desert = new Menu("Desert");
       Item one = new Item("porota");
       Item two = new Item("dalvaji");
       Item three = new Item("Kacci");
       Item four = new Item("Lacci");
       breakfast.addSubMenu(one);
       breakfast.addSubMenu(two);
       lunch.addSubMenu(three);
       desert.addSubMenu(four);
       lunch.addSubMenu(desert);
       
       breakfast.trav();
       lunch.trav();
    }
}
