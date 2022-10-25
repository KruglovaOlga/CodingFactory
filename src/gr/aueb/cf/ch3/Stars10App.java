package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει 10 οριζόντια αστεράκια, επαναληπτικά
 */

public class Stars10App {

    public static void main(String[] args) {
       /* int i = 1;

        while (i <= 10) {
            System.out.print("*");
            i++;

        */

        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 1;

        System.out.println("please insert number of stars");
        n = in.nextInt();

        while (i <= n) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}
