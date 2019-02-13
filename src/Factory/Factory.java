/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author USER
 */
public class Factory extends AbstractFactory{

    @Override
    iButton getButton(String device) {
        if(device.equalsIgnoreCase("Android"))
            return new androidFactory();
        if(device.equalsIgnoreCase("IOS"))
            return new iosFactory();
        return null;
    }
    
}
