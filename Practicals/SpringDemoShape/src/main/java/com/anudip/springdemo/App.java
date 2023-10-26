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
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("shape.xml");
    	Shape s1=(Shape) context.getBean("cir");
    	s1.draw();
    	Shape s2=(Shape) context.getBean("rect");
    	s2.draw();
    	Performer first=(Performer) context.getBean("rutik");
    	first.Perform();
    
    }
}
