package gr.aueb.cf.ch7;

import java.util.Scanner;

public class TypecastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme = "";
        int num = 0;

        System.out.println("insert  a string");
        lexeme = in.next();

        num = Integer.parseInt(lexeme);
        System.out.println("Num is: " + num);
    }
}
