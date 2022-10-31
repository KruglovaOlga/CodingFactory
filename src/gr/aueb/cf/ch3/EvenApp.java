package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ελεγχει αν ένας ακέραιος που δίνει ο χρήστης, είναι άρτιος
 */
public class EvenApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("please insert a number (int)");
        num = in.nextInt();
        isEven = (num % 2) == 0;
        System.out.println(num + " is even: " + isEven);
    }
}
