package org.scratch.greeter.xml;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;

/**
 * Created by Charles.Wang on 23/06/2015.
 */
public class App
{
    static Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main(String[] args)
    {

        LOGGER.warn( "ARRRRGHH!" );
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

        OtherWorld obj1 = (OtherWorld) context.getBean("otherWorld");

        context.registerShutdownHook();

    }
}
