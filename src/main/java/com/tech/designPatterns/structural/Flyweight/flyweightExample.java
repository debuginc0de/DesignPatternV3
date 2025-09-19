package com.tech.designPatterns.structural.Flyweight;

//This Pattern helps to reduce memory usage by sharing data among multiple Objects.
//Integer.valueOf(int): Caches Integer objects for values between -128 and 127.
//String.intern(): Shares instances of strings in the string pool.
//Boolean.valueOf(boolean): Reuses the Boolean.TRUE and Boolean.FALSE instances.

public class flyweightExample {
    public static void main(String[] args) {
        Integer a=Integer.valueOf(-128);
        Integer b=Integer.valueOf(-128);
        System.out.println(a==b); //true

        Integer c=Integer.valueOf(128);
        Integer d=Integer.valueOf(128);  //false

    }

}
