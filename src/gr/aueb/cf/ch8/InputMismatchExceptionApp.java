package gr.aueb.cf.ch8;
/**
 * Input Mismatch Exception is unchecked exception
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final  int MAGIC = 12;

        while (true) {
            try {
                System.out.println("insert an int");
                inputNum = in.nextInt();
                if (inputNum == MAGIC) break;
                System.out.println("input num = " + inputNum);
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("insert a valid int");
                in.nextLine();
            }
        }
    }
}
