package com.module2;

public class main {

    public static void main(String args[]){

        // checking static fields and methods
        car mustang = new car(); // using default constructor
        car charger = new car("Dodge", "Charger", 2017, 160, 5);
        mustang.print_info();
        charger.print_info();
        System.out.println("Number of cars: " + car.get_number_of_cars());

        // Inheritance and polymorphism example
        // In here Pikeman and Guman are represent single inheritance since they both inherited from the enemy base class
        Enemy enemy[] = new Enemy[2];
        enemy[0] = new Pikeman();
        enemy[1] = new Gunman();

        // Due to polymorphism JVM will print the corresponding attack function of the object
        for(Enemy x: enemy){
            x.attack();
        }
    }
}
