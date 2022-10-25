package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει εάν θα ανάψουν τα φώτα του αυτοκινήτου
 * με βάση 3 μεταβλητές : αν βρέχει ΚΑΙ ταυτόχρόνα ισχύει
 * ένα τουλάχιστον απο τα επόμενα, είναι σκοτάδι ή τρέχουμε
 * (speed > 100). Αυτές τις τιμές λαμβάνουμε από τον χρήστη.
 */

public class LightsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int velocity = 0;
        boolean lighsOn = false;

        System.out.println("please insert if it is raining (true / false)\n, "
        + "if it is dark (true / false)\n and velocity (int)");

        isRaining = in.nextBoolean();
        isDark = in.nextBoolean();
        velocity = in.nextInt();

        isRunning = (velocity > 100);
        lighsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On: " + lighsOn);
    }
}
