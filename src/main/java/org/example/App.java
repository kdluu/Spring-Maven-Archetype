package org.example;

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

//        Dev dev = new Dev();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Dev dev = applicationContext.getBean(Dev.class);
        dev.build();
    }
}
