/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commad_Factory;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        SimpleCommandCenter center = new SimpleCommandCenter();
    Light light = new Light();
    Fan fan = new Fan();
    
    LightOnCommad lightOnCommad = new LightOnCommad(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    
    FanOnCommand fanOnCommand = new FanOnCommand(fan);
    FanOffCommand fanOffCommand = new FanOffCommand(fan);
    
     center.setCommand(fanOnCommand);
     center.buttonWasPressed();
     center.resetCommand();
     
     center.setCommand(lightOnCommad);
     center.buttonWasPressed();
     center.resetCommand();
     
    }
}
