package org.rks07.config;


import org.rks07.Cricket;
import org.rks07.When;
import org.rks07.Year;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("org.rks07") // for Stereotype Annotation ( Can comment out all the code inside AppConfig
public class AppConfig {

//    @Bean(name ="thisYear")
//    public Year Year(){
////        the Method Name is the Bean Name by Default when we do not provide name
//        return new Year();
//    }

//    @Bean(name ="thisYear1")
////    @Scope("prototype") // this creates the object when it is called
//    public Year Year1(){
////        the Method Name is the Bean Name by Default when we do not provide name
//        return new Year();
//    }
//
//    @Bean
//    //Performing AUTOWIRE
//    public Cricket cricket(When when){
//        Cricket cric = new Cricket();
//        //cric.set;
//        return cric;
//    }
//
//    @Bean
//    public When when(){
//        return new When();
//    }
}
