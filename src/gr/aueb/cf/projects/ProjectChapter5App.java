package gr.aueb.cf.projects;

import java.util.Scanner;

public class ProjectChapter5App {
    final static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        String response;

        do {
            printMenu();
            response = getChoice();
            try {
                if (response.matches("[qQ]")){
                    quit = true;
                } else {
                    printOnChoice(response);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice");
            }
        } while (!quit);

    }

    public static void printMenu() {
        System.out.printf("Please select one of the following: ");
        System.out.println("1. Print Horizontal");
        System.out.println("2. Print Vertical");
        System.out.println("3. Print HV");
        System.out.println("4. HV Asc");
        System.out.println("4. HV Desc");
        System.out.println("5. Q or q to Quit");
    }

    public static String getChoice() {
        return in.nextLine().trim();
    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" * ");
        }
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    public static void printStarsHVAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printStarsHVDesc(int n) {
        for (int i = 1; i >= n; i--) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printOnChoice(String s) throws IllegalArgumentException {
        int choice;
        int n = 0;

        try {
            choice = Integer.parseInt(s);
            if ((choice >= 1) && (choice <= 5)) {
                System.out.println("Please insert the number of stars");
                n =Integer.parseInt(getChoice());
            }
            switch (choice) {
                case 1:
                    printStarsH(n);
                    break;
                case 2:
                    printStarsV(n);
                    break;
                case 3:
                    printStarsHV(n);
                    break;
                case 4:
                    System.out.println("4. Select");
                    break;
                case 5:
                    System.out.println("5. Q or q to Quit");
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
