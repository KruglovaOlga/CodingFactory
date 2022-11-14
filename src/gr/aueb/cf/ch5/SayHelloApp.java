package gr.aueb.cf.ch5;

/**
 * Prints Hello by using a method
 */
public class SayHelloApp {

    public static void main(String[] args) {
       String a = "Irine";
       sayHello(a);     //invoke sayHello()
    }

    /**
     * Says Hello
     * @param b name
     */
    public static void sayHello(String b) {
        System.out.println("Hello " + b);
    }
}
