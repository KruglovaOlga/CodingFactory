package gr.aueb.cf.ch16interface;

public class Dog implements ISpeakable{
    private String name;

    public Dog(){}

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Gav - gav");
    }
}
