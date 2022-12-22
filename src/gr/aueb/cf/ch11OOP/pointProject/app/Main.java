package gr.aueb.cf.ch11OOP.pointProject.app;

import gr.aueb.cf.ch11OOP.pointProject.model.Point;

public class Main {

    public static void main(String[] args) {

        Point point = new Point();

        point.setX(10);
        point.setY(20);

        System.out.println(point.pointToString());
    }
}
