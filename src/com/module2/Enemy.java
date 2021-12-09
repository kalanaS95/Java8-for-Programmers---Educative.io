package com.module2;

/*
*
* SuperClass (Mother Class or Base Class): This class allows the re-use of its non-private members in another class.
* SubClass (Child Class or Derived Class): This class is the one that inherits from the superclass.
*
*
*
*
*
*/

class Enemy {

    private String name;
    private int health;
    private int attack_power;
    private boolean is_stealthy;
    protected int xyz;

    // Default constructor
    public Enemy(){

        this.name = "Enemy";
        this.health = 100;
        this.attack_power = 10;
        this.is_stealthy = true;
    }

    // parameterized constructor
    public Enemy(String name, int health, int attack_power, boolean is_stealthy){

        this.name = name;
        this.health = health;
        this.attack_power = attack_power;
        this.is_stealthy = is_stealthy;
    }

    // copy constructor
    public Enemy(Enemy enemy_){

        this.name = enemy_.name;
        this.health = enemy_.health;
        this.attack_power = enemy_.attack_power;
        this.is_stealthy = enemy_.is_stealthy;
    }

    public void reduce_health(int reduce_amount){

        if(this.health - reduce_amount >= 0){

            this.health -= reduce_amount;
        }
        else{

            this.health = 0;
        }
    }

    public String get_name() { return this.name;}
    public int get_health() { return this.health;}
    public int get_attack_power() { return this.attack_power;}
    public boolean get_is_stealthy() { return this.is_stealthy;}

    // this method will be overridden in the derived classes
    public void attack(){

        System.out.println("Enemy is attacking");
    }
}
