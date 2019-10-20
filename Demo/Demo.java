package code;

//Quang Nguyen
//CS 5405
//Hw 1

import java.util.Scanner;

public class Demo
{
    public static void main(String [] args)
    {
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Author: Quang Nguyen");
        System.out.println("Homework 1\n");
        System.out.println("Enter 2 Integers: ");
        int numOfSide = scanner.nextInt();
        int lengthOfSide = scanner.nextInt();
        area = (numOfSide * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI / numOfSide));
        System.out.printf("Area: %f\n", area);
    }
}