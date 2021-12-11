package com.module2.abstraction;

// Note: inheritance type is multi level inheritance: Animal <------- Mamel <--------- Dog
public class dog extends mamel{

    private boolean has_spots;

    // Explicit default constructor
    public dog(){

        super();
        this.has_spots = false;
    }

    // Parameterized constructor
    public dog(int health, String color, int legs, boolean has_spots){

        super(health, color, legs);
        this.has_spots = has_spots;
    }

    // Note: we must override all the functions that comes from the Animal and Mamel classes
    @Override
    public void run() {

        System.out.println("Dog is running");
    }

    @Override
    public void make_sound() {

        System.out.println("Dog is making sound: Bark Bark !");
    }

    @Override
    public void walk() {

        System.out.println("Dog is walking");
    }
}
