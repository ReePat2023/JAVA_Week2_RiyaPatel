package Week2;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */

public class Program02 {
    static int a = 30; // Static variable
    static int b = 40; // Static variable

    public static void main(String[] args) { // Declare the Main method

        staticMethod();

    }

    public static void staticMethod() { //Static method.

        //  Call both static variables
        System.out.println(a);
        System.out.println(b);

    }
}

