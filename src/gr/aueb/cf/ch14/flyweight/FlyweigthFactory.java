package gr.aueb.cf.ch14.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweigthFactory {
    private static final List<ImmutablePoint> points = new ArrayList<>();
    private static final List<ImmutableCircle> circles = new ArrayList<>();

    private FlyweigthFactory(){}

    public static ImmutablePoint getPoint(int x, int y) {
        ImmutablePoint point = null;

        if (!pointExists(x, y, point)) {
            point = new ImmutablePoint(x, y);
            points.add(point);
        }
        return point;
    }

    public static boolean pointExists(int x, int y, ImmutablePoint point) {
        boolean found = false;
        point = null;

        for (ImmutablePoint p : points) {
            if((p.getX() == x) && (p.getY() == y)) {
                point = p;
                found = true;
                break;
            }
        }
        return found;
    }
}
