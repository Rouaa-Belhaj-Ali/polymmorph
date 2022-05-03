package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Vehicule vehicule = new Vehicule();
        Car car = new Car ();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        Vehicule[] racers = {car,boat,bicycle};
        for (Vehicule x : racers){
            x.go();
        }
    }
}
