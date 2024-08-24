package org.rks07;

public class Jevlin {

    private  int range;

    private  int range2;

    When when;

    public Jevlin(int range, When when, int range2){
        this.range = range;
        this.when =when;
        this.range2 = range2;
    }

    public void check(){

        System.out.print("Jevlin Throw was "+ range + " at ");
        when.time();
    }
}
