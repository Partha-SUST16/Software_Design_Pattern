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
public class FanOnCommand implements ICommand{
    private Fan fan;
    public FanOnCommand(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
