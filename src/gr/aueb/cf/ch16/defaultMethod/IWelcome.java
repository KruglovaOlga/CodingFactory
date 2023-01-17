package gr.aueb.cf.ch16.defaultMethod;

public interface IWelcome {
    void saySomething(String message);

    default void sayHello() {
        System.out.println("Good night to everyone in");
        sayHelloCF();
    }

    private void sayHelloCF() {
        System.out.println("Coding Factory");
    }

    static void sayHelloCoding() {
        System.out.println("Hello");
        sayCoding();
    }

    private static void sayCoding() {
        System.out.println("Coding");
    }
}
