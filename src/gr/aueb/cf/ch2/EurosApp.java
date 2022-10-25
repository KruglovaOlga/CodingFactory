package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει ένα ποσό euros σε euros500,
 * euros100,euros50,euros20, euros10, euros5
 */

public class EurosApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuros = 0;
        int euros500 = 0;
        int euros100 = 0;
        int euros50 = 0;
        int euros20 = 0;
        int euros10 = 0;
        int euros5 = 0;
        int remainningEuros = 0;

        System.out.println("please insert amount of euros");
        inputEuros = in.nextInt();
        remainningEuros = inputEuros;

        euros500 = remainningEuros / 500;
        remainningEuros = remainningEuros % 500;

        euros100 = remainningEuros / 100;
        remainningEuros = remainningEuros % 100;

        euros50 = remainningEuros / 50;
        remainningEuros = remainningEuros % 50;

        euros20 = remainningEuros / 20;
        remainningEuros = remainningEuros % 20;

        euros10 = remainningEuros / 10;
        remainningEuros = remainningEuros % 10;

        euros5 = remainningEuros / 50;
        remainningEuros = remainningEuros % 5;

        System.out.println("Euros: " + inputEuros);
        System.out.printf("%d Euros = euros500: %d\n " +
                        "euros100: %d\n euros50: %d\n " +
                        "euros20: %d\n euros10: %d\n euros5: %d\n",
                inputEuros, euros500, euros100,
                euros50, euros20, euros10, euros5);

    }
}
