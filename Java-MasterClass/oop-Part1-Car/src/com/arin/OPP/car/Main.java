package com.arin.OPP.car;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car toyota = new Car();
	    porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
