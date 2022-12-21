package gr.aueb.cf.ch7String;
/**
 * Typecast from String to int.
 * If the String is not valid int then
 * NumberFormatException is thrown.
 *
 * H nextInt() του scanner μετατρέπει  αυτόματα  τα strings σε ints
 * • Αν όμως διαβάσουμε κανονικά με  .next() τότε για να
 * μετατρέψουμε σε int χρησιμοποιούμε την Integer.parseInt()
 */

import java.util.Scanner;

public class TypecastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme = "";
        int num = 0;

        System.out.println("insert  a string");
        lexeme = in.next();

        num = Integer.parseInt(lexeme);
        System.out.println("Num is: " + num);
    }
}
