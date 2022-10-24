package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo, Reads two ints from standard
 * input (keyboard) and gets/prints the sum
 * @author
 */
public class ScannerApp {

    public static void main(String[] args) {
        //Δήλωση (declaration) μεταβλητών
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        //Εντολές
        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in. nextInt();

        sum = num1 + num2;

        //Εμφάνηση αποτελεσμάτων
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.printf("Sum of %d + %d = %d", num1, num2, sum);
    }
}
