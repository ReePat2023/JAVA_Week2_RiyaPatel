package Week2;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program04 {
    int a = 10; //Instance variable
    int b = 20; // Instance variable
    static int c = 30; // Static variable
    static int d = 40; // Static variable

    public static void main(String[] args) {

        Program04 instanceMethod = new Program04();
        instanceMethod.instanceMethod();
        staticMethod();
    }
    public void instanceMethod() { //Instance method.

        //  Call both instance and static variables
        Program04 instanceMethod = new Program04();
        System.out.println(a);
        System.out.println(b);
        System.out.println(instanceMethod.c);
        System.out.println(instanceMethod.d);
    }

    public static void staticMethod() { //Static method.

        //  Call both instance and static variables
        Program04 staticMethod = new Program04();
        System.out.println(staticMethod.a);
        System.out.println(staticMethod.b);
        System.out.println(c);
        System.out.println(d);

    }
}
