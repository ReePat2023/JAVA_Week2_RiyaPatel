package Week2;

import java.util.Scanner;

public class Program16 {


    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter First binary value : ");
        String b1 = s1.next();
        System.out.print("Enter Second binary value : ");
        String b2 = s1.next();


        int num1 = Integer.parseInt(b1,2);
        int num2 = Integer.parseInt(b2,2);
        int sum = num1 + num2;

        System.out.println("num1 :" + Integer.toBinaryString(num1)); // Addition
        System.out.println("num2 :" + Integer.toBinaryString(num1));
        System.out.println("sum :" + Integer.toBinaryString(sum));
    }
}

