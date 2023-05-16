package Week2;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */


import java.util.Scanner;

public class Program05 {

    public static void main(String[] args)
    {
        Program05 p5 = new Program05();

        int x,y;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter First value of x : ");
        x = s1.nextInt();
        System.out.print("Enter Second value of y : ");
        y = s1.nextInt();

        addition(x,y);
        subtraction(x,y);

        p5.multiplication(x,y);
        p5.division(x,y);

    }
    public static void addition(int x,int y) { //Static method

        System.out.println("Addition of " + x + " + " + y + " is = " + (x + y)); // Addition

    }
    public static void subtraction(int x,int y) { //Static method

        System.out.println("Subtraction of " + x + " - " + y + " is = " + (x - y)); // Subtraction

    }
    public void multiplication(int x,int y) { //Instance method

        System.out.println("Multiplication of " + x + " * " + y + " is = " + (x * y)); // Multiplication

    }
    public void division(int x,int y) { //Instance method

        System.out.println("Division of " + x + " / " + y + " is = " + (x / y)); // Division

    }
}
