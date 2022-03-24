package mypac;

import java.util.Scanner;

/*
Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или нечетно. (Подсказка: използвайте оператора ?:)

Използвайте IF – ELSE вместо „?:“
 */

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        if(number%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
