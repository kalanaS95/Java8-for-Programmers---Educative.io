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

    }
}
