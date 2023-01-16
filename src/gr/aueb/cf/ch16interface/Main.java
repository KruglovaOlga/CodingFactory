package gr.aueb.cf.ch16interface;

public class Main {
    public static void main(String[] args) {
        //implements only interface's methods, not class methods
        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Bob");

        //alice.speak();
        //bob.speak();

        doSpeak(alice);
        doSpeak(bob);
    }

    //loosely coupled
    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();
    }
}
