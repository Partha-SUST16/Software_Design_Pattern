/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite_Pattern;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Menu implements AbstractMenu{

    private String name;
    private ArrayList<AbstractMenu> submenu = new ArrayList();
    
    public Menu(String name)
    {
        this.name = name;
    }
    public void addSubMenu(AbstractMenu obj)
    {
        submenu.add(obj);
    }
    
    @Override
    public void trav() {
       System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        for (AbstractMenu includedFile : submenu) {
           
            AbstractMenu obj = (AbstractMenu) includedFile;
            obj.trav();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
    
}
