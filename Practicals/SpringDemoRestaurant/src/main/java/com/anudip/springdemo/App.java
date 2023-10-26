package com.anudip.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Spring.config.xml");
    	Restaurant res= (Restaurant) context.getBean("restaurantBean");
    	res.greetmessage();
    	res.prepareDrink();
    }
}
