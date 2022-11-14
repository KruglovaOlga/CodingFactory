package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        System.out.println("insert an int");
        a = in.nextInt();

        System.out.printf("The %d%s is Even", a, (isEven(a)? " ": " Not "));
    }

    public static boolean isEven(int a) {
        return (a % 2) == 0;
    }

    /*public static boolean isOdd(int a) {
        return !isEven(a);
    }*/
}
