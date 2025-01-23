package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();



    }
}
