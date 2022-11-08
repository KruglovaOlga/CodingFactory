package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("insert n");
        n = in.nextInt();

        System.out.printf("%d! = %d", n, facto(n));
    }

    public static int facto(int n) {
        int result = 1;

        for(int i = 1; i<= n; i++) {
            result *= i;
        }
        return result;
    }
}
