package com.pluralsight;

import java.util.Scanner;

public class BookInventory {
    private static Book[] books = new Book[20];

    private static int numBooks = 5;

    public static void main(String[] args) {

        books[0] = new Book(1, "9780241412039", "Diary of a Wimpy Kid: WRECKING BALL", false, "");
        books[1] = new Book(2, "9780810983915", "Diary of a Wimpy Kid: Dog Days", false, "");
        books[2] = new Book(3, "9780241745168", "Diary of a Wimpy Kid: Party Pooper", false, "");
        books[3] = new Book(4, "9780241322000", "Diary of a Wimpy Kid: The Meltdown", false, "");
        books[4] = new Book(5, "9781419711893", "Diary of a Wimpy Kid: The Long Haul", false, "");

        Scanner scan = new Scanner(System.in);

        boolean isDone = false;

        while (!isDone) {

            System.out.println("Welcome to the Library Home Screen");
            System.out.println("\n======================\n");
            System.out.println("1: Display Available Books");
            System.out.println("2: Display Checked out Books");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");

            int userChoice = scan.nextInt();
            scan.nextLine();

            switch (userChoice) {
                case 1:
                    displayAvailableBooks(scan);
                    break;
                case 2:
                    displayCheckedOutBooks(scan);
                    break;
                case 3:
                    System.out.println("Thank you for coming!");
                    isDone = true;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }

    public static void displayAvailableBooks(Scanner scan) {

        System.out.println("\nAvailable Books");
        System.out.println("\n======================\n");

        for (int i = 0; i < numBooks; i++) {

            if (books[i].isCheckedOut() == false) {
                System.out.println(books[i]);
            }
        }

        System.out.println("\n1: Would you like to checkout a book?");
        System.out.println("2: Exit to Home Screen");
        System.out.print("Enter your choice: ");
        int userChoice = scan.nextInt();
        scan.nextLine();

        switch (userChoice) {
            case 1:
                checkOutBook(scan);
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void checkOutBook(Scanner scan) {
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("\nEnter the Id of the book you would like to checkout: ");
        int bookCheckingOutId = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getId() == bookCheckingOutId) {
                books[i].setCheckedOut(true);
                books[i].setCheckedOutTo(name);
            }
        }
    }

    public static void displayCheckedOutBooks(Scanner scan) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].isCheckedOut() == true) {
                System.out.println(books[i] + " checkedout by " + books[i].getCheckedOutTo());
            }
        }
        System.out.println("C: Would you like to check in a book? ");
        System.out.println("X: Exit to Home Screen");
        System.out.print("Enter your choice: ");
        String userChoice = scan.nextLine();

        switch (userChoice.toLowerCase()) {
            case "c":
                checkInBook(scan);
                break;
            case "x":
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    public static void checkInBook(Scanner scan) {
        System.out.println("Enter the Id of the book you would like to check in: ");
        int bookCheckingInId = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getId() == bookCheckingInId) {
                books[i].setCheckedOut(false);
                books[i].setCheckedOutTo("");
            }
        }
        System.out.println("Thank you for checking the book!");
    }
}


