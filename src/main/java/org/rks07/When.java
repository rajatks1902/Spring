package org.rks07;



import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Calendar;

@Component
public class When implements MatchTime {

    public When(){
        System.out.println("When Check");
    }

    @Override
    public void time(){
        Calendar calendar =Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//       System.out.println("Now");
    }
}
