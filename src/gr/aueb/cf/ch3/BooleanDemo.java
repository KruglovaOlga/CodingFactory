package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση δύο μεταβλητές:
 * αν βρέχει και αν η θερμοκρασία < 0
 */

public class BooleanDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temperature = 0;

        System.out.println("please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("please insert temperature (int)");
        temperature = in.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println("is snowing: " + isSnowing);

    }
}
