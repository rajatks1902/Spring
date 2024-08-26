package org.rks07;

import org.rks07.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Jevlin jevlin =context.getBean(Jevlin.class);
        jevlin.check();
//

//        Year y = context.getBean(Year.class);
//        y.time();
//
//        Year yt = context.getBean( Year.class);
//        yt.time();
//
//        Cricket cri =context.getBean(Cricket.class);
//        cri.play();


//        XML Method

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//
//        Football foot1 = (Football) applicationContext.getBean("football");
//        foot1.play();
//
//        Jevlin jevlin = (Jevlin) applicationContext.getBean("jevlin");
//        jevlin.check();
//
//
//
//        Football foot2 = (Football) applicationContext.getBean("football");
//        foot2.play();
//
//        Cricket cric = (Cricket) applicationContext.getBean("cricket");
//        cric.play();

    }
}
