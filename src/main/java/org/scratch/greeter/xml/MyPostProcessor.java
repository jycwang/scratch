package org.scratch.greeter.xml;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

/**
 * Created by Charles.Wang on 23/06/2015.
 */
public class MyPostProcessor implements BeanPostProcessor
{
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println( "BeforeInitialization : " + beanName + " : " +  bean );
        return bean;  // you can return any other object as well
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println( "AfterInitialization : " + beanName + " : " + bean );
        return bean;  // you can return any other object as well
    }
}
