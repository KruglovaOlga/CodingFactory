package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * παιχνιδι
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int KEY = 10;
        int inputNum = 0;
        boolean bingo = false;

        do {
            System.out.println("please guess the number");
            inputNum = in.nextInt();

            if (inputNum == KEY) {
                System.out.println("Bingo");

            } else {
                System.out.println("try again");
            }
        } while (!bingo);
    }
}
