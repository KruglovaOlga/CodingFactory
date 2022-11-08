package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * διαβάζει απο stdin την αρχική τιμή,
 * το βήμα αυξήσης/ μείωσης. Εκτυπώνει το i
 * και το πλήθος των επαναλήψεων
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iteration = 0;

        System.out.println("please insert start, end and step (int)");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            System.out.println(i + " ");
            iteration++;
        }
        System.out.println();
        System.out.println("Interation = " + iteration);
    }
}
