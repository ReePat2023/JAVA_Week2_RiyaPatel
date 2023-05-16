package Week2;
/**
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Program09 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Your uppercase Line : ");
        String x = s1.nextLine();

       String x1 = x.toLowerCase();

        System.out.println("Your lowercase line is " + x.toLowerCase());
    }
}
