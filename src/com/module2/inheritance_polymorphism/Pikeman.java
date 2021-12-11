package com.module2.inheritance_polymorphism;

/*
* EXTENDS - keyword used for inheritance.
*           E.g. class Pikeman extends Enemy means Pikeman inherits from Enemy (Pikeman is an Enemy)
*
* SUPER - keyword use to refer to the base/parent class (Like we use this keyword to refer to the class)
*         use-cases:
*         1. Accessing parent class fields (E.g. super.field_name)
*         2. Accessing parent class methods (E.g. super.method_name)
*         3. Accessing parent constructor (E.g. super(), super(int x, int y, int z), super(Derived_class derived_))
*
*  Note: The call to the SuperClass constructor using super() is usually the first line of code inside the constructor of the SubClass.
*        If we do not call super() in the SubClass constructor, the default no-argument constructor of SuperClass is called automatically.
*        The super(parameters) call has to be used if we want to call a parameterized constructor of the SuperClass.
*
*   TYPES OF INHERITANCE IN JAVA:
*   1. Single
*   2. Multi-level
*   3. Hierarchical
*   4. Multiple - Need interfaces to implement
*   5. Hybrid - Need interfaces to implement
*
* */

public class Pikeman extends Enemy{

    private int shield_health;
    private String shield_color;

    // default constructor
    public Pikeman(){

        super(); // calling super-class/base-class (i.e. Enemy) constructor
        this.shield_health = 100;
        this.shield_color = "Red";
    }

    // parameterized constructor
    public Pikeman(String name, int health, int attack_power, boolean is_stealthy, int shield_health, String shield_color){

        super(name, health, attack_power, is_stealthy); // calling super-class/base-class (i.e. Enemy) constructor
        this.shield_health = shield_health;
        this.shield_color = shield_color;
    }

    // copy constructor
    public Pikeman(Pikeman pikeman_){

        super(pikeman_.get_name(), pikeman_.get_health(), pikeman_.get_attack_power(), pikeman_.get_is_stealthy());
        this.shield_health = pikeman_.shield_health;
        this.shield_color = pikeman_.shield_color;
    }

    // Here we are overriding the attack method inherited from the Enemy parent class
    // NOTE: if not overridden in derived class, base class method will be used
    public void attack(){

        // NOTE: We can base class's attack function within this overridden method using super keyword
        // E.g. super.attack();
        System.out.println("Pikeman is attacking");
    }
}
