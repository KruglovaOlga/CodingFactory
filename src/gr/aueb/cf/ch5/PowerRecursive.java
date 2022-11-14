package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerRecursive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;

        System.out.println("insert two ints");

        a = in.nextInt();
        n = in.nextInt();

        System.out.println(power(a, n));

    }

    public static int power (int a, int n) {
        /*if(n == 0) {
            return 1;
        } else {
            return a * power(a, n- 1);
        }*/
        return (n == 0) ? 1 : a * power(a, n- 1);

    }
}
