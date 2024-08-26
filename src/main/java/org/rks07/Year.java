package org.rks07;

public class Year implements  MatchTime {

    public Year(){
        System.out.println("Year object Created");
    }
    @Override
    public void time() {
        System.out.println("There is never nothing going on");
    }
}
