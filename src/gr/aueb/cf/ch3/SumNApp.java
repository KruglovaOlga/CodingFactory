package gr.aueb.cf.ch3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * διαβάζει ακέραιο n και βρίσκει αθροισμα απο 1 εως n
 */
public class SumNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number (int)");
        int sum = 0;
        int i = 1;
        int n = in.nextInt();

        while (i <= n) {
            sum = sum + i; //sum += i
            i++;
        }
        System.out.println("sum = " + sum);


    }
}
