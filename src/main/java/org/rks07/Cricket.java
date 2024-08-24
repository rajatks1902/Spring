package org.rks07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Cricket {

    // to check how many times object is created
    public  Cricket(){
        System.out.println("GOAT");
    }

    public  void play(){
        System.out.println("lets Play Cricket at : ");
//        when.time();
    }
}
