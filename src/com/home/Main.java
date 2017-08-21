package com.home;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println();
        // write your code here


        Person person = new Person();      // this runs the 1st default constructor
        System.out.println("");
        Person person1 = new Person("John", 18, "Beerzel");   // this runs the 2th constructor
        System.out.println("");
        Person person2 = new Person(80,1.90);     // this runs the 3th constructor
        System.out.println("");
        Person person3 = new Person();
        System.out.println(person1);    // calls the toString method
        Person person4 = new Person();



    }
}