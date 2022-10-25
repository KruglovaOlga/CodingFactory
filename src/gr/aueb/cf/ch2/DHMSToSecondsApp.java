package gr.aueb.cf.ch2;

import java.util.*;

/**
 * Μετατρέπει μέρες, ώρες, λεπτά, δευτερολεπτα
 * σε συνολικά δευτερόλεπτα
 */

public class DHMSToSecondsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;
        long totalSeconds = 0L;
        long inputDays = 0L;
        long inputHours = 0L;
        long inputMinutes = 0L;
        long inputSecs = 0L;

        System.out.println("please insert days, hours, minutes, seconds (ints");
        inputDays = in.nextLong();
        inputHours = in.nextLong();
        inputMinutes = in.nextLong();
        inputSecs = in.nextLong();

        totalSeconds = (inputDays * SEC_PER_DAY) + (inputHours * SEC_PER_HOUR)
                + (inputMinutes * SEC_PER_MIN) + inputSecs;
        System.out.printf(Locale.US, "Total seconds: %,d",totalSeconds);
    }
}
