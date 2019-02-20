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
public class SimpleCommandCenter {
    private ICommand iCommand;
    
    public SimpleCommandCenter(){
        
    }
    public void setCommand(ICommand command) { iCommand = command; }
    public void buttonWasPressed() { iCommand.execute(); }
    public void resetCommand(){iCommand.undo();}
}
