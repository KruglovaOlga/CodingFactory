package gr.aueb.cf.ch16.multipleInterface;

public class TalkingBook implements ITalkingBook{

    @Override
    public void read() {
        System.out.println("Could be read");
    }

    @Override
    public void speak() {
        System.out.println("can speak");
    }
}
