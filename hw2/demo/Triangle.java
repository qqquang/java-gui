package code;

import java.lang.Math;


//import code.GeometricObject;

public class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3, String color, Boolean isFilled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setIsFilled(isFilled);
    }

    public double getSide1()
    {
        return side1;
    }

    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public void setSide3(double side3)
    {
        this.side3 = side3;
    }

    public double getPerimeter()
    {
        double perimeter;
        perimeter = (side1 + side2 + side3) / 2;
        return perimeter;
    }

    public double getArea()
    {
        double perimeter = getPerimeter();
        double area;
        area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
        return area;
    }

    public void printString()
    {
        System.out.println(super.toString());
        System.out.printf("area: %.2f\n", getArea());
        System.out.printf("perimeter: %.2f\n", getPerimeter());
        System.out.printf("color: %s\n", getColor());
        System.out.printf("is filled: %b\n", getIsFilled());
    }
}