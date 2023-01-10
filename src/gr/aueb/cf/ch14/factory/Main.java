package gr.aueb.cf.ch14.factory;

public class Main {
    public static void main(String[] args) {
        Point p1 = Point.getZeroPoint();
        Point p2 = Point.getRandomPoint();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
