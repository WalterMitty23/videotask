package org.example;

import java.util.List;

import static org.example.BookShelf.distributeBooks;

public class Main {
    public static void main(String[] args) {
        List<String> books = List.of(
                "Harry Potter", "The Hobbit", "War and Peace", "1984", "Pride and Prejudice",
                "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", "The Catcher in the Rye", "The Lord of the Rings"
        );

        List<List<String>> distributedBooks = distributeBooks(books);

        for (int i = 0; i < distributedBooks.size(); i++)  {
            System.out.println("Shelf " + (i + 1) + ": " + distributedBooks.get(i));
        }
    }
}
