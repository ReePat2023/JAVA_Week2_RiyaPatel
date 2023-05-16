package Week2;

/**
 * Write a Java program to swap two variables.
 */
public class Program15 {

    public static void main(String[] args) {

    int a = 10;
    int b = 20;
    System.out.println("Before swap");
    System.out.println("One value " + a);
    System.out.println("Second value " + b);

    int swap = a;
    a = b;
    b = swap;

    System.out.println("After swap");
    System.out.println("One value " + a);
    System.out.println("Second value " + b);

    }
}