package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * μετραει άθροισμα των ψηφίων ενός ακεραίου
 */
public class DigitsSumApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int sum = 0;
        int digit = 0;
        int digitCount = 0;

        System.out.println("insert an integer");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            digit = num % 10;
            digitCount++;
            sum += digit;
            num = num / 10;
        }while (num != 0);
        System.out.printf("DigitCount: %d, DigitSum: %d",digitCount, sum);
    }
}
