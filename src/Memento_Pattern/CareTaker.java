/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Pattern;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CareTaker {
    private ArrayList<Memento> arr = new ArrayList<>();
    int cur = 0;
    public void addMe(Memento m)
    {
        arr.add(cur,m);cur++;
    }
    public Memento getMemento(int i)
    {
        return arr.get(i);
    }
    public Memento undo()
    {
        cur--;
        System.out.println("Undo done : now State is "+arr.get(cur-1).getState());
        return arr.get(cur-1);
    }
    public Memento redo()
    {
        cur++;
        System.out.println("Redo done : now State is "+arr.get(cur-1).getState());
        return arr.get(cur-1);
    }
    public int getCur(){return cur;}
}
