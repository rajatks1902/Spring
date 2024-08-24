package org.rks07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Cricket {

    // to check how many times object is created
    public  Cricket(){
        System.out.println("GOAT");
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private  int time ;

    public When getWhen() {
        return when;
    }

    public void setWhen(When when) {
        this.when = when;
    }

    When when;

    public  void play(){
        System.out.println("lets Play Cricket at : "+ (time-1));
        when.time();
    }
}
