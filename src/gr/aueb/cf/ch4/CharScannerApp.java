package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * read char with Scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';
        inputChar = in.nextLine().charAt(0);

        System.out.println("input char: " + inputChar);
    }
}
