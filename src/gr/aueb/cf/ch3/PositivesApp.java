package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * διαβάζει ακεραίους μέχρι να βρει αρνητικό σταματάει
 * τυπώνει αθροισμα θετικών
 */

public class PositivesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number (int)");
        int num = 0;
        int positivesCount = 0;

        num = in.nextInt();

        while (num >= 0) {
            System.out.println("one positive inserted");
            positivesCount++;
            System.out.println("please insert new positive");
            num = in.nextInt();
        }
        System.out.println("A negative was inserted.");
        System.out.println("Positives total count: " + positivesCount);

    }
}
