package gr.aueb.cf.ch14.factory;

import java.util.Random;

/**
 * Point Java Bean
 */
public class Point {
    private double x;
    public Point() {}

    public Point(double x) {
        this.x = x;
    }

    /**
     * A static factory that returns a (0, 0) new point
     * @return a new (0, 0)
     */
    public static Point getZeroPoint() {
        return new Point();
    }

    /**
     * A static factory that returns a random point
     * between 0 - 100
     * @return random point between 0 - 100
     */
    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextDouble() * 101);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                '}';
    }
}
