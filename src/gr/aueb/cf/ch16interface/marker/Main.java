package gr.aueb.cf.ch16interface.marker;

public class Main {

    public static void main(String[] args) {
        Item book = new Book(1, "123", "T", "Java");
        Item cd = new CompactDisk(1, "Prince");

        deliver(book);
        deliver(cd);
    }

    public static void deliver(Item item) {
        if(item instanceof Book) {
            System.out.println("Book delivered");
        } else if (item instanceof CompactDisk) {
            System.out.println("CD delivered");
        } else  {
            throw new AssertionError(item);
        }
    }
}
