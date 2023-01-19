package gr.aueb.cf.ch16.skeletal;

public class Main {
    public static void main(String[] args) {


    // create instance of Circle
    Circle c = new Circle(5);
        c.setId(1L);
        System.out.println("Circle Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle ID: " + c.getId());

    // create instance of Line
    Point p1 = new Point(1, 2);
    Point p2 = new Point(3, 4);
    Line l = new Line(p1, p2);
        System.out.println("Line X1: " + l.getX1());
        System.out.println("Line X2: " + l.getX2());
        System.out.println("Line ID: " + l.getId());
}
}
