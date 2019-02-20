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
public class LightOnCommad implements ICommand{

    private Light light;
    public LightOnCommad(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
    
}
