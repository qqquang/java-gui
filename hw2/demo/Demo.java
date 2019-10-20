package code;

//Quang Nguyen
//CS 5405
//Hw 1

import java.util.Scanner;

//import code.GeometricObject;
//import code.Triangle;

public class Demo
{
    public static void main(String[] args)
    {
        double area;
        double side1, side2, side3;
        String color;
        Boolean isFilled;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Author: Quang Nguyen");
        System.out.println("Homework 2\n");

        System.out.print("Side 1: " );
        side1 = scanner.nextDouble();
        System.out.print("Side 2: " );
        side2 = scanner.nextDouble();
        System.out.print("Side 3: " );
        side3 = scanner.nextDouble();
        System.out.print("color: " );
        color = scanner.next();
        System.out.print("Is the triangle filled?(true or false): " );
        isFilled = scanner.nextBoolean();
        System.out.println();
        Triangle triangle = new Triangle(side1,side2,side3,color,isFilled); 
        triangle.printString();
    }
}
