package gr.aueb.cf.ch16.defaultMethod;

public class CodingFactory implements IWelcome{
    @Override
    public void saySomething(String message) {
        System.out.println("Please read the following message: " + message);
    }

    @Override
    public void sayHello() {
        IWelcome.super.sayHello();
        System.out.println("\u2764".repeat(17));
    }
}
