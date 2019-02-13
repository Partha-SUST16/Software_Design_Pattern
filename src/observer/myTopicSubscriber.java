/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author USER
 */
public class myTopicSubscriber implements observer{

    private String name;
    private subject sub;
    
    public myTopicSubscriber(String name)
    {
        this.name = name;
    }
    @Override
    public void update() {
        String msg = (String)sub.getUpdate(this);
        if(msg==null)
        {
            System.out.println(name+" :: no new message");
        }
        else {
            System.out.println(name+" : consuming :: "+msg);
        }
    }

    @Override
    public void setSubject(subject sub) {
        this.sub = sub;
    }
    
}
