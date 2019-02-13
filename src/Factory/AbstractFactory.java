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
public abstract  class AbstractFactory {
    abstract iButton getDevice(String device);
}
