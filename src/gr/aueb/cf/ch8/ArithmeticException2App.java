package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticException2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("insert a numerator and denominator");

            numerator = in.nextInt();
            denominator = in.nextInt();

            if (isZero(denominator)) {
                System.out.println("denominator must not be zero");
                continue;
            }
            result = numerator / denominator;
            if (result == 1){
                System.out.printf("%d / %d = %d\n", numerator, denominator, result);
                break;
            }
            System.out.printf("%d / %d = %d\n", numerator, denominator, result);
        }
    }

    /**
     * State-testing method
     * @param num       the num to check for
     * @return          true, if num is zero, false otherwise
     */
    public static boolean isZero(int num) {
        return num == 0;
    }

}
