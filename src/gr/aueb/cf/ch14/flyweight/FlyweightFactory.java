package gr.aueb.cf.ch14.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * No instances of this class should be available (Utility class).
 * <br>
 * This is also a facade design pattern. It provides a
 * simplified interface (i.e. factory) to a set classes:
 * {@link ImmutablePoint} and {@link ImmutableCircle}
 * <br>
 * At the same time, this specific implementation
 * of facade, implements the Flyweight pattern (Модель наилегчайшего веса)
 */
public class FlyweightFactory {
    private static final List<ImmutablePoint> points = new ArrayList<>();
    private static final List<ImmutableCircle> circles = new ArrayList<>();

    private FlyweightFactory(){}

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
