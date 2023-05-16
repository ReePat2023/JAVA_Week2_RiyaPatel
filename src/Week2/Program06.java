package Week2;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Program06 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {

        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * (r * r);
        System.out.println("The area of circle is: " + area);

    }
}