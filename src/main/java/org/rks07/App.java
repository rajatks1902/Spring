package org.rks07;

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
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Cricket cric = (Cricket) applicationContext.getBean("cricket");
        cric.play();

        Football foot1 = (Football) applicationContext.getBean("football");
        foot1.play();

        Football foot2 = (Football) applicationContext.getBean("football");
        foot2.play();

        Jevlin jevlin = (Jevlin) applicationContext.getBean("jevlin");
        jevlin.check();
    }
}
