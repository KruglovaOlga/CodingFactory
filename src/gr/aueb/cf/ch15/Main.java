package gr.aueb.cf.ch15;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }
}
