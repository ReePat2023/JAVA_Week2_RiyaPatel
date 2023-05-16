package Week2;


/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double x = s1.nextDouble();
        System.out.print("Input the second number: ");
        double y = s1.nextDouble();
        System.out.print("Input the third number: ");
        double z = s1.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }

}
