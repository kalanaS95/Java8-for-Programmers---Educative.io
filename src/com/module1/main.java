package com.module1;

public class main {

    public static void main(String[] args){

        // printing
        // \t - tab, \n - new line
        // quotes in a string "HI \" I'm a string \" "
        System.out.println("Hello World");

        // formatting strings, %f - float, %d - decimal, %s - string
        System.out.format("%f is an approximation of pi.\n", 3.14159);

        // padding
        System.out.format("%5d %5d %5d\n", 4,200,99);
        System.out.format("%2.2f %2.2f %2.2f\n", 20.0, 30.568, 1.45);

        // Primitive data types
        int integer = 12; // 32 bits
        float my_float = 23; // 32 bits
        double float_num = 12.2; // 64 bits
        boolean my_bool = true; // 1 bit
        char my_char = 'q'; // 16 bit
        byte my_byte = 1; // -128 and a maximum value of 127 (inclusive) - 8 bits
        short my_short = 255; // minimum value of -32,768 and a maximum value of 32,767 (inclusive) - 16 bits
        long my_long = 234; //  minimum value of -2^63 and a maximum value of 2^(63)-1 - 64 bits

        // division of two integers result in integer values
        System.out.println(5/2);
        // way to fix it
        // 1.
        System.out.println(5/2.0); // make one of the values float or make both float
        // 2. type cast
        System.out.println((double)5/2); // type cast one or both values

        // operations of two types converts the results to the more limiting type
        // then convert to the other type
        // E.g. 2 + 1.7 --> 2 converts to 2.0  ---> then adds 1.7
        System.out.println(2+1.7);

        /* implicit type casting
            is performed by the compiler on its own when it encounters a mixed data type expression in the program.
            it is also known as automatic conversion as it is done by compiler without programmer’s assistance.
            implicit casting doesn’t require a casting operator.
        */
        // Example 1:
        int a = 42;
        double b = a;
        // Example 2
        System.out.println(2+1.7);

        /* Explicit type casting
             is performed by the programmer. In this type casting programmer tells compiler to type cast one data type
             to another data type using type casting operator. but there is some risk of information loss is there,
             so one needs to be careful while doing it.
        */
        // Example 1
        double x = 42.12;
        int y = (int)x;

        // Increment operators
        x++;
        y--;
        x+=5;
        y/=2;
        y*=5;

        int test =0;
        // post increment
        System.out.println("Before Post Increment: " + (test++));
        System.out.println("After Post Increment: " + (test));
        // pre increment
        System.out.println("Pre Increment: " + (++test));

        // Java methods - Values/arguments are passed by value !
        // passed by value for primitive data types (char, boolean, int , float, double and wrappers for primitives like Integer, Double, etc.)
        // pass by reference for non-primitives such as objects, arrays (are objects in JAVA), strings
        int test_val =0;
        increment_(test_val);
        System.out.println(test_val);
        Integer test_value = 0;
        increment_(test_value);
        System.out.println(test_value);

        // Non primitive type passing arguments
        int test_arr[]  = {1,2};
        // or
        int test_array[] = new int[10]; // initialized to zero
        // or
        int test_array2[] = new int[] {1,2,3,4,5};

        System.out.println("Before function call: " + test_arr[0]);
        changeArray(test_arr);
        System.out.println("After function call: " + test_arr[0]);

        test test_ = new test(12);
        System.out.println("Before function call: " + test_.getter());
        changeObj(test_);
        System.out.println("After function call: " + test_.getter());

        // to exit a program
        // System.exit();

        // with strings we cant use [] operator access element
        // we must use .charAt() method // returns a char
        String xx = "Hello";
        System.out.println(xx.charAt(0));
        // length of string
        System.out.println(xx.length());

        // STRINGS ARE IMMUTABLE IN JAVA - WE CANNOT CHANGE !
        // Thats why even though we pass the string reference to a method, it does not get changed !
        // If mutable strings are needed use StringBuffer class in Java

        // Similar to C++ java arrays cannot be resized once initialized
        // For resizable containers ArrayList is an option
        // array definition
        // 1 Method
        int int_arr[] = new int[2];
        // 2 Method
        int int_arr1[] = {1,2};
        // get length of an array
        System.out.println(int_arr.length);

        // for each loops in Java
        int primes[] = {2,3,5,7,11,13};
        for(int prime: primes){

            System.out.println(prime);
        }
    }

    // pass by value since parameter is primitive
    public static void increment_(int x){

        x++;
    }

    // method overload - different amount of parameters, different parameter ordering, different parameter types
    // BUT RETURN TYPE CANNOT BE DIFFERENT !
    // pass by value since parameter is primitive
    public static void increment_(Integer x){

        x++;
    }

    // passed by reference since arrays are objects in Java
    public static void changeArray(int[] array){

        array[0] = 100;
    }

    // passed by reference since arrays are objects in Java
    public static void changeObj(test tester){

        tester.setter(35);
    }
}

