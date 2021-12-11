package com.module2;

import com.module2.classes_objects.car;
import com.module2.inheritance_polymorphism.Enemy;
import com.module2.inheritance_polymorphism.Gunman;
import com.module2.inheritance_polymorphism.Pikeman;
import com.module2.abstraction.*;

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

        // abstraction example using super super class (calling methods using super super class)
        // Note in this case we wont be able to call any methods/fields introduced in mamel abstract class
        /*
        animal animals[] = new animal[2];
        animals[0] = new human();
        animals[1] = new dog();
        */

        // abstraction example using super class (calling methods using super class)
        mamel mamels[] = new mamel[2];
        mamels[0] = new human();
        mamels[1] = new dog();

        System.out.println();
        System.out.println("Calling functions using mamel abstract class array");
        for(mamel x: mamels){
            x.walk();
            x.run();
            x.make_sound();
            System.out.println();
        }

    }
}
