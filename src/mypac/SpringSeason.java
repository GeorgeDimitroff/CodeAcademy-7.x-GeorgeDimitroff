package mypac;

import java.text.ParseException;
import java.util.Scanner;

/*
Напишете програма SpringSeason, в която дефинирате 2 int променливи - month & day.
Програмата трябва да отпечатва true ако денят е между 20ти Март (включително) и 20ти Юни (включително) и false в противен случай.
Булева стойност на израза ? „yes” : “false”

Пренапишете вашата програма, като използвате Scanner (за месеца и деня) и if-else, вместо "? : "
 */

public class SpringSeason {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day 1-31: ");
        int day = Integer.parseInt(scan.nextLine());
        System.out.print("Enter month 1-12: ");
        int month = Integer.parseInt(scan.nextLine());

        if(month == 3 && day >= 20 && day <=31 ||
           month == 4 && day >= 1 && day <= 30 ||
           month == 5 && day >= 1 && day <= 31 ||
           month == 6 && day >= 1 && day <=20){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
