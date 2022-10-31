package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
* υπολογίζει τον μικροτερο απο δυο ακεραιους
 */
public class MinApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();
        /*
        if (num1 < num2) {
            min = num1;
        }else {
            min = num2;
        }

         */
        min = (num1 < num2) ? num1: num2;
        System.out.printf("min %d ", min);

    }
}
