package gr.aueb.cf.ch16.skeletal;

public class Line extends AbstractShape{
    private Point x1;
    private Point x2;

    public Line(){};

    public Line(Point x1, Point x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Point getX1() {
        return x1;
    }

    public void setX1(Point x1) {
        this.x1 = x1;
    }

    public Point getX2() {
        return x2;
    }

    public void setX2(Point x2) {
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
