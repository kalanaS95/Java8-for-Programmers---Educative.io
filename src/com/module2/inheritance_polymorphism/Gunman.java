/*
*
* Advantages of the Method Overriding
*   1. The derived classes can give their own specific implementations to inherited methods without modifying the parent class methods.
*   2. For any method, a child class can use the implementation in the parent class or make its own implementation.
*
* Key Features of the Method Overriding
*   1. Method Overriding needs inheritance and there should be at least one derived class.
*   2. Derived class/es must have the same declaration, i.e., access modifier, name, same parameters
*      and same return type of the method as of the base class.
*   3. The method in the derived class/es must have different implementation from each other.
*   4. The method in the base class must need to be overridden in the derived class.
*   5. Base class/method must not be declared as the Final class.
*
*   DYNAMIC POLYMORPHISM == METHOD OVERRIDING (During RUNTIME)
*   STATIC POLYMORPHISM == METHOD OVERLOADING (During COMPILATION TIME)
*
* */

package com.module2.inheritance_polymorphism;

public class Gunman extends Enemy{

    private int gun_type;
    private int ammo_capacity;

    // Explicit default constructor
    public Gunman(){

        super();
        this.gun_type = 1;
        this.ammo_capacity = 180;
    }

    // Parameterized constructor
    public Gunman(String name, int health, int attack_power, boolean is_stealthy, int gun_type, int ammo_capacity){

        super(name, health, attack_power, is_stealthy);
        this.gun_type = gun_type;
        this.ammo_capacity = ammo_capacity;
    }

    // Copy constructor
    public Gunman(Gunman gunman_){

        super(gunman_.get_name(), gunman_.get_health(), gunman_.get_attack_power(), gunman_.get_is_stealthy());
        this.gun_type = gunman_.gun_type;
        this.ammo_capacity = gunman_.ammo_capacity;
    }

    // Here we are overriding the attack method inherited from the Enemy parent class
    // NOTE: if not overridden in derived class, base class method will be used
    public void attack(){

        // NOTE: We can base class's attack function within this overridden method using super keyword
        // E.g. super.attack();
        System.out.println("Gunman is attacking");
    }
}
