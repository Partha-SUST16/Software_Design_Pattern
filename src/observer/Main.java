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
public class Main {
    public static void main(String[] args) {
       myTopic topic = new myTopic();
       
       observer ob1 = new myTopicSubscriber("on1");
       observer ob2 = new myTopicSubscriber("ob2");
       observer ob3 = new myTopicSubscriber("ob3");
       
       topic.register(ob1);
       topic.register(ob2);
       topic.register(ob3);
       
       ob1.setSubject(topic);
       ob2.setSubject(topic);
       ob3.setSubject(topic);
       
       ob1.update();
       
       topic.postMessage("New Message");
    }
}
