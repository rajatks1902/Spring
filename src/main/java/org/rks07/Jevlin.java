package org.rks07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@Component // this helps to skips the AppConfig/spring.xml Work
public class Jevlin {

    private  int range;

    private  int range2;

    @Autowired
//    @Qualifier("when")
    When when;

//    @Autowired
//    public Jevlin(@Value("${range:10}") int range, When when, @Value("${range2:20}") int range2) {
//        this.range = range;
//        this.when = when;
//        this.range2 = range2;
//    }

    public void check(){

        System.out.print("Jevlin Throw was "+ range + " at ");
        when.time();
    }
}
