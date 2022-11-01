package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Bingo2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int KEY = 10;
        int num = 0;
       // boolean isFound = false;

        while (true) {
            System.out.println("guess the key");
            num = in.nextInt();

            if (num == KEY) {
                //isFound = true;
                //System.out.println("congratulation!!!");
                break;
            } else {
                System.out.println("try again");
            }
        }
        System.out.println("congratulation!!!");
    }
}
