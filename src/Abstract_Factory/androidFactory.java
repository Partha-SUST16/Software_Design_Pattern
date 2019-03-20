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
public class androidFactory implements iButton{

    @Override
    public void createButton() {

        System.out.println("Black Button Created:: Android");
    }
    
}
