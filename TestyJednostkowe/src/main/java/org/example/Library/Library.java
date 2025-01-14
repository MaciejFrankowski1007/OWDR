package org.example.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>(); //Konstruktor
    }


    public void addBook(Book book){
        books.add(book); //Metoda dodająca książkę do kolekcji
    }

    public List<Book> searchByTitle(String title) {
        if (title == null || title.isEmpty()) {
            return new ArrayList<>(); //Zwraca pustą listę, jeśli tytuł jest nullem lub go nie ma
        }
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    //Metoda wypożyczania książki
    public boolean borrowBook(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && book.isAvailable()){
                book.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    //Metoda zwrotu książki
    public void returnBook (Book book) {
        if (books.contains(book)){
            book.setAvailable(true);
        }
    }

}
