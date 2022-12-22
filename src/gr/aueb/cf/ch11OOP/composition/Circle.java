package gr.aueb.cf.ch11OOP.composition;

/**
 *Mutable circle
 */
public class Circle {
    private Point center;
    private int radius;

    public Circle() {}

    public Circle(Point center, int radious) {
        this.center = center;
        this.radius = radious;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radious=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }
}
