package gr.aueb.cf.ch10Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final ArrayList<Integer> digits = new ArrayList<>();
        int inputNumber, digitsCount = 0, sum = 0, num = 0, digit = 0;
        boolean isArmstrong = false;

        System.out.println("Please insert a number");
        inputNumber = in.nextInt();

        num = inputNumber;
        do {
            digitsCount++;
            digit = num % 10;
            digits.add(digit);
            num = num /10;
        } while (num != 0);

        for (int item : digits) {
            sum += Math.pow(item, digitsCount);
        }

        isArmstrong = (sum == inputNumber);
        System.out.println(inputNumber);
        System.out.println(sum);
        System.out.printf("%d is Armsrong: %s", inputNumber, (isArmstrong) ? "YES" : "FALSE");
    }
}
