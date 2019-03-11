/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
        Light light = new Light();
        Projector projector = new Projector();
        DVD dvd = new DVD();
        Movie movie = new Movie(dvd,light,projector);
        movie.playMovie();
        System.out.println("---------------------------------------------");
        movie.stopMovie();
    }
    
}
