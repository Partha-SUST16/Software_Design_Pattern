/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviour;

/**
 *
 * @author CSE CARNIVAL 2017
 */
public class Singletonobj {

    private static Singletonobj singletonobj;

    private Singletonobj() {

    }

    public static Singletonobj getInstance() {
        if (singletonobj == null) {
            singletonobj = new Singletonobj();
            System.out.println("I am Created ");
        }
        else {
            System.out.println("I was previously created");
        }
        return singletonobj;
    }
}

class Main {

    public static void main(String[] args) {
        Singletonobj singleton = Singletonobj.getInstance();
        Singletonobj singleton1 = Singletonobj.getInstance();
        Singletonobj singleton2 = Singletonobj.getInstance();
    }
}
