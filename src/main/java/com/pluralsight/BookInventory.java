package com.pluralsight;

import java.util.Scanner;

public class BookInventory {
    private static Book[] books = new Book[20];

    private static int numBooks = 5;

    public static void main(String[] args) {

        books[0] = new Book(1, "9780241412039", "Diary of a Wimpy Kid: WRECKING BALL", false, null);
        books[1] = new Book(2, "9780810983915", "Diary of a Wimpy Kid: Dog Days", false, null);
        books[2] = new Book(3, "9780241745168", "Diary of a Wimpy Kid: Party Pooper", false, null);
        books[3] = new Book(4, "9780241322000", "Diary of a Wimpy Kid: The Meltdown", false, null);
        books[4] = new Book(5, "9781419711893", "Diary of a Wimpy Kid: The Long Haul", false, null);

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
                    displayBooks();
                    break;
                case 2:
                    displayCheckedOutBooks();
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

    public static void displayBooks() {

    }

    public static void displayCheckedOutBooks() {

    }

}
