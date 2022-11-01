package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsious = 0;

        System.out.println("insert temperature in fahrenheit ");
        fahrenheit = in.nextInt();

        celsious = 5 * (fahrenheit - 32) /9;

    }
}
