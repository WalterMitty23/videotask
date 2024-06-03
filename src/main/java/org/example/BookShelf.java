package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    private static final int NUMBER_OF_SHELVES = 5;

    public static List<List<String>> distributeBooks(List<String> bookTitles) {
        List<String> mutableBookTitles = new ArrayList<>(bookTitles);
        Collections.sort(mutableBookTitles);

        List<List<String>> shelves = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_SHELVES; i++) {
            shelves.add(new ArrayList<>());
        }

        int totalBooks = mutableBookTitles.size();
        int booksPerShelf = (int) Math.ceil((double) totalBooks / NUMBER_OF_SHELVES);

        for (int i = 0; i < NUMBER_OF_SHELVES; i++) {
            int start = i * booksPerShelf;
            int end = Math.min(start + booksPerShelf, totalBooks);
            if (start < end) {
                shelves.get(i).addAll(mutableBookTitles.subList(start, end));
            }
        }

        return shelves;
    }
}
