package com.pluralsight;

public class BookInventory {
    private static Book[] books = new Book[20];

    private static int numBooks = 5;

    public static void main(String[] args) {

        books[0] = new Book(1, "9780241412039", "Diary of a Wimpy Kid: WRECKING BALL", false, null);
        books[1] = new Book(2, "9780810983915", "Diary of a Wimpy Kid: Dog Days", false, null);
        books[2] = new Book(3, "9780241745168", "Diary of a Wimpy Kid: Party Pooper", false, null);
        books[3] = new Book(4, "9780241322000", "Diary of a Wimpy Kid: The Meltdown", false, null);
        books[4] = new Book(5, "9781419711893", "Diary of a Wimpy Kid: The Long Haul", false, null);


    }
}
