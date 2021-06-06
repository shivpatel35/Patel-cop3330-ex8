package org.ex8;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        //Scanner Declaration
        Scanner p = new Scanner(System.in);
        Scanner pizza = new Scanner(System.in);
        Scanner slices = new Scanner (System.in);

        //Variable intialization
        int pizzas = 0;
        int people = 0;
        int slices_per_person = 0;
        int slices_per_pizza = 0;
        int total_slices = 0;

        //User input and variable storing
        System.out.println("How many people?");
        people = p.nextInt();

        System.out.println("How many pizzas do you have?");
        pizzas = pizza.nextInt();

        System.out.println("How many slices per pizza?");
        slices_per_pizza = slices.nextInt();

        //Calculation for total slices, slices per person, and remainder
        total_slices = (slices_per_pizza  * pizzas);
        slices_per_person =  total_slices/ people;
        int remainder = (pizzas * slices_per_pizza) - total_slices;

        //Output statements from calculations
        System.out.println(  people + " people with " + pizzas + " pizzas (" + total_slices + " slices)");
        System.out.println("Each person gets " + slices_per_person + " slices");
        System.out.println("There are " + remainder + " pieces");


    }
}
