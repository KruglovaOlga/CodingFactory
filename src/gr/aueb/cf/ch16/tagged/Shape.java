package gr.aueb.cf.ch16.tagged;
//low readability class

public class Shape {
    private enum TYPE {RECTANGLE, CIRCLE}

    //tag field
    private TYPE type;

    //fields for Circle
    private double radius;

    //fields for rectangle
    private double width;
    private double height;

    //constructor for circle
    public Shape(double radius) {
        type = TYPE.CIRCLE;
        this.radius = radius;
    }

    //constructor for rectangle
    public Shape(double width, double height) {
        type = TYPE.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        switch (type){
            case CIRCLE:
                return radius * radius * Math.PI;
            case RECTANGLE:
                return width * height;
            default:
                throw new AssertionError(type);
        }
    }
}
