package com.module2.abstraction;

public abstract class mamel extends animal{

    protected int legs;

    // Explicit default constructor
    public mamel(){

        super(); // invoke animal abstract class constructor
        this.legs  = 4;
    }

    // Parameterized constructor
    public mamel(int health, String color, int legs){

        super(health, color);
        this.legs = legs;
    }

    public abstract void run();

    // abstract classes cna have non-abstract methods
    public void print_legs(){

        System.out.format("I have %d legs \n", this.legs);
    }

}
