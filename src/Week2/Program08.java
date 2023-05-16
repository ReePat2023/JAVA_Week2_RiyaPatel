package Week2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Program08 {

    public static void main(String[] args) {

        double base;
        double height;
        double area;

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter First value of x : ");
        base = s1.nextInt();
        System.out.print("Enter Second value of y : ");
        height = s1.nextInt();

        area = (base *height) /2;

        System.out.println("Area of Triangle is : " + area);

    }


}
