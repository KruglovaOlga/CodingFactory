package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Point(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                '}';
    }

    public void movePlus10() {
        //Self-use
        for(int i = 1; i <= 10; i++) {
            movePlusOne();
        }
    }

    protected void movePlusOne() {
        x += 1;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }

    private void reset() {
        x = 0;
    }
}
