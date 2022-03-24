package mypac;

import java.util.Scanner;

/*
 Направете програма BMI с която да изчислите вашият Body Mass Index.

 Използвайте IF – ELSE вместо „?:“
 */


public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mass is kg: ");
        double mass = Double.parseDouble(scan.nextLine());
        System.out.print("Enter height in meters: ");
        double height = Double.parseDouble(scan.nextLine());

        double BMI = mass/(height*height);

        if(BMI < 18.4){
            System.out.println("Underweight");
        }
        else if(BMI > 25){
            System.out.println("Overweight");
        }
        else
            System.out.println("Normal Weight");
    }
}
