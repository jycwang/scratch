package org.scratch.greeter.xml;

/**
 * Created by Charles.Wang on 23/06/2015.
 */
public class OtherWorld
{
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Other Message : " + message);
    }

    public void initme(){
        System.out.println("Other bean is going through init.");
    }
    public void destroy(){
        System.out.println("Other bean will destroy now.");
    }
}
