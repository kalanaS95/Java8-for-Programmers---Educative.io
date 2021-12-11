package com.module2.abstraction;

/*
*
* ABSTRACT DATA TYPES/CLASSES: is a type that only defines ‘what operations are to be performed?’
*                               rather than ‘how to be performed?’
*
* ABSTRACT CLASSES and INTERFACES used in java to achieve abstraction
*
* ABSTRACT keyword:
*       1. can be used with the METHODS and CLASSES only.
*       2. Abstract classes/methods only tells what operations should be done(Just the definition/prototype)
*          whoever use these methods/classes have to implement the methods/classes
*
* ABSTRACT methods (rules):
*       1. In contrast to a concrete/normal Java method an abstract method does not have a body/definition
*          i.e. it only has a declaration or method signature inside an abstract class or an interface
*       2. An abstract method can be declared inside an abstract class or an interface only.
*       3. In other words, it can be said that to contain any abstract method in its implementation
*          a class has to be declared as an abstract class because non-abstract classes cannot have abstract methods.
*       4. An abstract method cannot be declared private as it has to be implemented in some other class.
*       Example:
*           public abstract void reduce_fuel(int distance); // there's no body for this function
*
* ABSTRACT classes (rules):
*       1. An abstract class cannot be instantiated i.e. one cannot create an object of an abstract class.
*       2. An abstract class can have the declaration of abstract method(s) (as an abstract method’s body cannot
*          be implemented in an abstract class) but it is not compulsory to have any.
*       3. Non-abstract/normal methods can be implemented in an abstract class.
*       4. To use an abstract class it needs to be inherited from.
*       5. The class which inherits from the abstract class must implement all the abstract methods declared in the parent abstract class.
*       6. An abstract class can have everything else as same as a normal Java class has i.e. constructor, static variables and methods.
*       Example:
*           abstract class Class_name{}
*
*
* */


public abstract class animal {

    protected int health;
    protected String color;

    // Explicit default constructor
    public animal(){

        this.health = 100;
        this.color = "";
    }

    // Parameterized constructor
    public animal(int health, String color){

        this.health = health;
        this.color = color;
    }

    public abstract void make_sound();
    public abstract void walk();
}
