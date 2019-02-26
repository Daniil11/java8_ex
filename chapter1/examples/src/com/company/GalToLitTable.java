package com.company;

public class GalToLitTable {
    public static void main (String[] args){
        double gal,lit;
        for (int i=1;i<=100;i++){
            if (i%10 != 0){
                gal = i;
                lit = gal * 3.7854;
                System.out.println(gal+" gal = "+lit+" lit");
            } else {
                gal = i;
                lit = gal * 3.7854;
                System.out.println(gal+" gal = "+lit+" lit");
                System.out.println();
            }
        }
    }
}
