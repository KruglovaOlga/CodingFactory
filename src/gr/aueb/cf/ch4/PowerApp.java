package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει το α^β.
 * Διαβάζει το α και το β από το πληκτρολόγιο
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;

        System.out.println("please insert a, b (ints)");
        a = in.nextInt();
        b = in.nextInt();

        for(int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.printf("%d^%d = %d", a, b ,result);
    }
}
