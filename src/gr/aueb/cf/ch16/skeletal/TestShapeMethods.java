package gr.aueb.cf.ch16.skeletal;


import org.junit.Test;
import static org.junit.Assert.*;

    public class TestShapeMethods {

        @Test
        public void testCircleGetArea() {
            Circle c = new Circle(5);
            double expected = 78.53981633974483; // Math.PI * 5^2
            double actual = c.getArea();
            assertEquals(expected, actual, 0.00001);
        }

        @Test
        public void testCircleGetRadius() {
            Circle c = new Circle(5);
            double expected = 5;
            double actual = c.getRadius();
            assertEquals(expected, actual, 0.00001);
        }

        @Test
        public void testLineGetX1() {
            Point p1 = new Point(1, 2);
            Point p2 = new Point(3, 4);
            Line l = new Line(p1, p2);
            Point expected = p1;
            Point actual = l.getX1();
            assertEquals(expected, actual);
        }

        @Test
        public void testLineGetX2() {
            Point p1 = new Point(1, 2);
            Point p2 = new Point(3, 4);
            Line l = new Line(p1, p2);
            Point expected = p2;
            Point actual = l.getX2();
            assertEquals(expected, actual);
        }

        @Test
        public void testAbstractShapeGetId() {
            Circle c = new Circle(5);
            c.setId(1L);
            Long expected = 1L;
            Long actual = c.getId();
            assertEquals(expected, actual);
        }
    }

