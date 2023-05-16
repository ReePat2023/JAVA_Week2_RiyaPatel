package Week2;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */

import java.util.Scanner;

public class Program07 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a any Temperature: ");
        double F = input.nextDouble();

        double  celsius =( (F - 32) * 5 / 9 );
        System.out.println("Degree Celsius = " + F + "  " + celsius );
    }
}

