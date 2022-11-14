package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculate a^n using method
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  = 0;
        int n  = 0;
        int result = 0;

        System.out.println("insert a and n");
        a = in.nextInt();
        n = in.nextInt();
        /**
         * invokes pow with actual parameters a, n pow
         * returns the power of a^n which is assigned to result
         */
        result = pow(a, n);

        System.out.printf("%d^%d = %d", a, n, result);
    }

    /**
     *
     * @param a     the base
     * @param n     the power
     * @return      the power of a to n
     */
    public static int pow(int a, int n) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int power = 1;

        //Εντολές - Δομές Ελέγχου
        for (int i = 1; i <= n; i++) {
            power *= a;
        }
        return power;
    }
}
