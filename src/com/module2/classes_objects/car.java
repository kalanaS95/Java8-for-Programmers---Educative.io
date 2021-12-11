package com.module2.classes_objects;

/* Java access modifiers for both data members(fields) and methods

    Modifier	Class	Package	Subclass	World
    public	    Y	    Y	    Y	        Y
    protected	Y	    Y	    Y	        N
    no modifier	Y	    Y	    N	        N
    private	    Y	    N	    N	        N

    NOTE: Subclass is a class derived from a parent class. subclass == derived class

    PACKAGE: is a namespace that organizes a set of related classes and interfaces.
             Conceptually you can think of packages as being similar to different folders on your computer

    STATIC fields: when we declare a field static, exactly a single copy of that
                   field is created and shared among all instances of that class.
                   * Don't need to initialize an object to access static fields
                   * (i.e. static fields belongs to the class not the object)
                   Reasons to use static fields:
                   1. When the value of the variable is independent of objects
                   2. When the value is supposed to be shared across all objects

    STATIC methods: We generally use static methods to perform an operation that is not dependent upon instance creation.
                    In order to share a code across all instances of that class, we write that code in a static method
                    * We also commonly use static methods to create utility or helper classes so that we can get them
                    * without creating a new object of these classes. (E.g. Collection and Math classes in Java)
                    Reasons to use static methods:
                    1. To access/manipulate static variables and other static methods that don't depend upon objects
                    2. static methods are widely used in utility and helper classes.

    NON-STATIC fields and methods: Belongs to the object not the class.

    FINAL fields: Value of a final field/variable cannot be changed once value is assigned
                  Must be assigned at the field/variable definition
*/

/* Calling constructor within a constructor
 *
 * 1. Default -> this()
 * 2. Parameterized -> this("Dodge", "Charger", 2017, 160, 5)
 * 3. Copy -> this(car_)
 *
*/

public class car {

    private String make;
    private String model;
    private int year;
    private int top_speed;
    private int seats;
    private static int num_cars = 0; // check static field definition above
    private final boolean gased = true;

    // default constructor
    // If explicit default constructor is not found, JVM will set fields to 0 or null by default
    public car(){

        this.make = "Ford";
        this.model = "Mustang";
        this.year = 2017;
        this.top_speed = 160;
        this.seats = 4;
        num_cars++; // or car.num_cars to be more specific (i.e. in case another class use the same variable name)

    }

    // parameterized constructor
    public car(String make, String model, int year, int top_speed, int seats){

        this.make = make;
        this.model = model;
        this.year = year;
        this.top_speed = top_speed;
        this.seats = seats;
        num_cars++;
    }

    // Copy constructor: NOTE: Java does not create a default copy constructor if we did not write our own like C++
    public car(car car_){

        this.make = car_.make;
        this.model = car_.model;
        this.year = car_.year;
        this.top_speed = car_.top_speed;
        this.seats = car_.seats;
        num_cars++;
    }

    public static int get_number_of_cars(){

        return car.num_cars;
    }

    public void print_info(){
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Top speed: " + this.top_speed);
        System.out.println("Seats: " + this.seats);
        System.out.println();
    }
}
