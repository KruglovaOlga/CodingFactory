package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη ένα ακέραιο που αντιστοιχεί
 * στο πλήθος τον δευτερολέπτων και μετατρέπει
 *  σε ημέρες, ώρες, λεπτά
 *  και δευτερόλεπτα και εκτυπώνει το αποτέλεσμα στην οθόνη
 */
public class Seconds {

    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;

        int inputSeconds = 0;
        int remainingSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;

        System.out.println("please insert number of seconds(int)");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY;
        remainingSeconds = remainingSeconds % DAY;

        hours = remainingSeconds / HOUR;
        remainingSeconds = remainingSeconds % HOUR;

        minutes = remainingSeconds / MINUTE;
        remainingSeconds = remainingSeconds % MINUTE;

        System.out.printf("Input Seconds: %d = %d days, %d hours, %d minutes, %d seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);

    }
    }
