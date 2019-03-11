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
public class Movie {
    private DVD dvd;
    private Light light;
    private Projector projector;

    public Movie(DVD dvd, Light light, Projector projector) {
        this.dvd = dvd;
        this.light = light;
        this.projector = projector;
    }
   
   public void playMovie(){
       dvd.load();
       projector.on();
       light.off();
       System.out.println("Playing Movie");
   }
   public void stopMovie(){
       projector.off();
       light.off();
       dvd.unload();
       System.out.println("Stopped Movie");
   }
    
}
