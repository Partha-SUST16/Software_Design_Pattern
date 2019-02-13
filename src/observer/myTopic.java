/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class myTopic implements subject{

    private List<observer>observers;
    private String msg;
    private boolean changed;
    private final Object MUTEX = new Object();
    
    public myTopic()
    {
        this.observers = new ArrayList<observer>();
    }
    @Override
    public void register(observer obj) {
        if(obj==null)
            throw new NullPointerException("NULL observer");
        synchronized(MUTEX){
            if(!observers.contains(obj))
                observers.add(obj);
        }
    }

    @Override
    public void unregister(observer obj) {
        synchronized(MUTEX){
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObserver() {
        List<observer> observersLocal = null;
        
        synchronized(MUTEX){
            if(!changed)return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for(observer obj : observersLocal)
            obj.update();
    }

    @Override
    public Object getUpdate(observer obj) {
        return this.msg;
    }
    
    //method to post message to the topic
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.msg=msg;
		this.changed=true;
		notifyObserver();
	}
    
}
