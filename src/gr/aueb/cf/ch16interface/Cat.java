package gr.aueb.cf.ch16interface;

public class Cat implements ISpeakable{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Miaou");
    }

}
