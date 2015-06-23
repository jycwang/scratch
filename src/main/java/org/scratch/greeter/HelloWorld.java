package org.scratch.greeter;

/**
 * Created by Charles.Wang on 23/06/2015.
 */
import org.joda.time.LocalTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {

        LocalTime currentTime = new LocalTime();

        System.out.println( "The current local time is: " + currentTime );

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext( GreeterConfig.class );

        Greeter greeter = ctx.getBean( Greeter.class );
        System.out.println( greeter.sayHello() );
    }
}