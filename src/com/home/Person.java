package com.home;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by gerdhung-chu on 20/08/17.
 */
public class Person {

    private String name;
    private int age;
    private String address;
  /*  private int weight;
    private double height;*/


    /*@Override
    public String toString(){
        return name + age + address;  // standaard toSTring met concatination maar is belastend voor het systeem

        }*/
    @Override
    public String toString() {                // StringBuilder betere code voor een toString
        StringBuilder build = new StringBuilder();
        build.append(name).append(" is ").append(age).append(" and lives in ").append(address).append(" >> Called by the toString StringBuilder");
        return build.toString();
    }


    public Person() {
        System.out.println("1 Default constructor ok");// default constructor
    }


    public Person(String name,int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("2de constructor ok");// Constructor
        System.out.println("This Person is called " + name + " and is " + age + " years old. His Address is " + address);
    }

    public Person (int weight, double height) {
        System.out.println("3de constructor ok");
        System.out.println("This person weight is " + weight + " kilograms and he is " + height + " meter tall.");
    }
  /*      public String toString(){
            StringBuilder build2 = new StringBuilder();
            build2.append("This person weight is ").append(weight).append(" and is ").append(height).append(" tall").append("This is de StringBuilder");
        return build2.toString();


    }*/

   /* public Person ( String name, int age) {                         // this is the 4th Constructor
        this.name = "Ktty";
        this.age = 28;
        System.out.print("This person is a girl. Her name is " + name + " and she is " + " years old");


    }*/

}




