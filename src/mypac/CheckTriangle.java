package mypac;

import java.util.Scanner;

/*
Напишете програма, която да проверя дали един триъгълник е разностранен,
равнобедрен или разностранен.

Равностранен триъгълник: За триъгълник се казва, че е равностранен триъгълник, ако всички страни са равни. Ако X, Y, Z са три страни на триъгълника.
Тогава триъгълникът е равностранен само ако X = Y = Z.

Равнобедрен триъгълник: Триъгълникът се нарича равнобедрен триъгълник, ако някоя от двете му страни е равни. Ако X, Y, Z са три страни на триъгълника.
Тогава триъгълникът е равнобедрен, ако X = Y или X = Z или Y = Z.

Разностранен триъгълник: Триъгълник се нарича разностранен триъгълник,
ако нито една от страните му не е равна.

1. Въвеждате от конзолата 3 страни – X, Y, Z
2. Проверете какъв тип е триъгълника и отпечатайте в конзолата, като използвате IF – ELSE IF – ELSE

 */

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter triangle side - x = ");
        double x = scan.nextDouble();
        System.out.print("Enter triangle side - y = ");
        double y = scan.nextDouble();
        System.out.print("Enter triangle side - z = ");
        double z = scan.nextDouble();

        if(x == y && y == z)
            System.out.println("Тriangle is equilateral");
        else if(x == y || x == z || y == z)
            System.out.println("Triangle is isosceles");
        else
            System.out.println("Triangle is versatile");
    }
}