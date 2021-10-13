package com.generation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean x = true;
        boolean y = false;
        boolean z = true;

        System.out.println( "El resultado es:" + ((x && y) || (x && z)) );
        System.out.println( "El resultado es:" + ((x || !y) && (!x || z)) );
        System.out.println( "El resultado es:" + (x || y && z ));
        System.out.println( "El resultado es:" + (!(x || y) && z) );
        System.out.println( "El resultado es:" + (x || y || x && !z && !y) );
        System.out.println( "El resultado es:" + (!x || !y || z && x && !y));
    }

}
