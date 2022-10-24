package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Euro to USD Converter
 */

public class EuroUsdConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int PARITY = 97; //exchange rate Euro to USD
        int totalUsaCents = 0;
        int inputEuros = 0;
        int usaDollars = 0;
        int usaCents = 0;

        System.out.println("please insert an amount (Euros) ");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * 99;
        usaDollars = totalUsaCents / 100;
        usaCents = usaDollars % 100;

        System.out.printf("%d euros = %d USA dollars & %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
