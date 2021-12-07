package com.module2;

public class main {

    public static void main(String args[]){

        // checking static fields and methods
        car mustang = new car(); // using default constructor
        car charger = new car("Dodge", "Charger", 2017, 160, 5);
        mustang.print_info();
        charger.print_info();
        System.out.println("Number of cars: " + car.get_number_of_cars());

    }
}
