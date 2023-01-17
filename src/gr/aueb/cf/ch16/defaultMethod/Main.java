package gr.aueb.cf.ch16.defaultMethod;

public class Main {

    public static void main(String[] args) {
        IWelcome welcomeCF = new CodingFactory();
        welcomeCF.sayHello();
    }
}
