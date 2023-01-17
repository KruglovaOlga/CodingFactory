package gr.aueb.cf.ch16.abstractClass;

public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("Miaaaouuu!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... she ate all its food and it is still hungry!");
    }
}
