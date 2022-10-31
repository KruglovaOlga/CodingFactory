package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MulApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number (int)");
        int mul = 1;
        int i = 1;
        int n = in.nextInt();

        while (i <= n) {
            mul = mul * i;
            i++;
        }
        System.out.println("mul = " + mul);

    }
}
