package gr.aueb.cf.ch15;

public class PointsDemo {
    private final static Point[] points;
    private static int counter1d = 0;
    private static int counter2d = 0;
    private static int counter3d = 0;

    static {
        points = new Point[] {
                new Point(1), new Point2D(1, 2),
                new Point3D(1, 2, 3), new Point3D(5, 7, 9)
        };


    }

    public static void main(String[] args) {
        for (Point point :points ) {
            point.printTypeOf();

            if(point instanceof Point3D) {
                counter3d++;
            }else if (point instanceof Point2D) {
                counter2d++;
            }else {
                counter1d++;
            }
        }

        System.out.println("Point instances: " + counter1d);
        System.out.println("Point 2D instances: " + counter2d);
        System.out.println("Point 3D instances: " + counter3d);
    }
}
