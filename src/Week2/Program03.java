package Week2;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program03 {
    int a = 10; //Instance variable
    static int b = 20; // Static variable

    public static void main(String[] args) {

        Program03 instanceMethod = new Program03();
        instanceMethod.instanceMethod();
        staticMethod();
    }

    public void instanceMethod() { //Instance method.

        //  Call both instance and static variables
        Program03 instanceMethod = new Program03();
        System.out.println(instanceMethod.a);
        System.out.println(instanceMethod.b);
    }

    public static void staticMethod() { //Static method.

        //  Call both instance and static variables
        Program03 staticMethod = new Program03();
        System.out.println(staticMethod.a);
        System.out.println(b);

    }
}
