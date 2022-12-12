package gr.aueb.cf.projects;

import java.util.Scanner;

public class ProjectCh3App  {
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
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Select");
        System.out.println("5. Q or q to Quit");
    }

    public static String getChoice() {
        return in.nextLine().trim();
    }

    public static void printOnChoice(String s) throws IllegalArgumentException {
        int choice;

        try {
            choice = Integer.parseInt(s);

            switch (choice) {
                case 1:
                    System.out.println("1. Insert");
                    break;
                case 2:
                    System.out.println("2. Update");
                    break;
                case 3:
                    System.out.println("3. Delete");
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
