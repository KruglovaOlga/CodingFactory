package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εκτυπώνει 10 σειρές απο 10 αστεράκια
 */
public class Stars10x10 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            j = 1;
            while (j <= 10) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
