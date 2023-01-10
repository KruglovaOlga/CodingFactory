package gr.aueb.cf.ch14.singleton;

public class Main {
    public static void main(String[] args) {
        CodingFactory codingFactory = CodingFactory.getInstance();
        codingFactory.sayHello();
    }
}
