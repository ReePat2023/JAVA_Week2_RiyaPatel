package Week2;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program01 {
    int a = 10; //Instance variable
    int b = 20; //Instance variable

    public static void main(String[] args) { // Declare the Main method

        Program01 instanceMethod = new Program01();
        System.out.println(instanceMethod.a);
        System.out.println(instanceMethod.b);
    }

    public void instanceMethod() { //Instance method.

        //  Call both instance variables
        System.out.println(a);
        System.out.println(b);
    }

}
