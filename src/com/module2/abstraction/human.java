package com.module2.abstraction;

public class human extends mamel{

    private int IQ;

    public human(){

        super();
        this.IQ = 135;
    }

    public human(int health, String color, int legs, int IQ){

        super(health, color, legs);
        this.IQ = IQ;
    }

    @Override
    public void make_sound() {

        System.out.println("Human is making a sound: Hello World !");
    }

    @Override
    public void walk() {

        System.out.println("Human is walking");
    }

    @Override
    public void run() {

        System.out.println("Human is running");
    }

}
